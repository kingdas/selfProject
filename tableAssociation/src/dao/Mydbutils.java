package dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Mydbutils {
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;

	/**
	 * ��ȡ�����ļ�����
	 */
	static {
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		DRIVER = p.getProperty("driver");
		URL = p.getProperty("url");
		USERNAME = p.getProperty("username");
		PASSWORD = p.getProperty("password");
	}
	/**
	 * ע������
	 */
	static {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			System.out.println("����ע��ʧ��");
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���ݿ�����Ӷ���
	 * 
	 * @return ���Ӷ���
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * ִ�в�ѯ
	 * 
	 * @param sql
	 * @param clsʵ����
	 * @return ����
	 */
	public static <T> List<T> executeR(String sql, Class<T> cls) {
		List<T> ls = new ArrayList<T>();
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			ls = resultSetToModel(rs, cls);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			release(conn, stat, rs);
		}
		return ls;
	}

	/**
	 * �ѽ����ת���ɼ���
	 * 
	 * @param rs
	 * @param cls
	 * @return
	 */
	public static <E> List<E> resultSetToModel(ResultSet rs, Class<E> cls) {
		List<E> ls = new ArrayList<E>();
		ResultSetMetaData rsmd = null;
		Object o = null;
		Field f = null;
		String cn = null;
		try {
			rsmd = rs.getMetaData();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			while (rs.next()) {
				o = cls.newInstance();// ÿѭ��һ�εõ�һ����¼����������¼�ĸ����赽��Ӧ��ʵ���������Ӧ��������
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					cn = rsmd.getColumnName(i);
					try {
						f = cls.getDeclaredField(cn);
						f.setAccessible(true);
						f.set(o, rs.getObject(cn));
					} catch (Exception e) {
					}
				}
				ls.add((E) o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 * ִ�в�ѯ
	 * 
	 * @param sql
	 * @return �����
	 */
	public static ResultSet executeR(Connection conn, String sql) {
		ResultSet rs = null;
		try {
			Statement stat = conn.createStatement();
			rs = stat.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * ִ����ɾ��
	 * 
	 * @param sql
	 * @return ��Ӱ�������
	 */
	public static int executeCUD(String sql) {
		int n = 0;
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConnection();
			stat = conn.createStatement();
			n = stat.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			release(conn, stat, null);
		}
		return n;
	}

	public static void release(Connection conn, Statement stat, ResultSet rs) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (stat != null && !stat.isClosed()) {
				stat.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}