package dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Dbutils {
	private static final String DRIVE;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	// ע������
	static {
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		DRIVE = p.getProperty("driver");
		URL = p.getProperty("url");
		USERNAME = p.getProperty("username");
		PASSWORD = p.getProperty("password");

		try {
			Class.forName(DRIVE);
		} catch (ClassNotFoundException e) {
			System.out.println("ע�������쳣");
			e.printStackTrace();
		}
	}

	// �������Ӷ���
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.out.println("�������Ӷ����쳣");
			e.printStackTrace();
		}
		return conn;
	}

	// ��ѯ���ݿ�,���ؼ���
	public static <t> List<t> executeR(String sql, Class<t> cls) {
		List<t> li = new ArrayList<t>();
		Connection conn = getConnection();
		Statement sta = null;
		try {
			sta = conn.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = sta.executeQuery(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSetMetaData rsmd = null;
		String cname = null;
		Field f = null;
		Object o = null;
		try {
			rsmd = rs.getMetaData();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			while (rs.next()) {
				o = cls.newInstance();
				for (int i = 1; i < rsmd.getColumnCount(); i++) {
					cname = rsmd.getColumnName(i);
					try {
						f = cls.getDeclaredField(cname);
						f.setAccessible(true);
						f.set(o, rs.getObject(cname));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				li.add((t) o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			release(conn, sta, rs);
		}
		return li;

	}

	// ��ѯ ���ݿ����
	public static ResultSet executeR(Connection conn, String sql) {
		Statement sta = null;
		ResultSet rs = null;
		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	// ����ɾ���� ����
	public static int executeCUD(String sql) {
		Connection conn = null;
		Statement sta = null;
		int n = 0;
		try {
			conn = getConnection();
			sta = conn.createStatement();
			n = sta.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			release(conn, sta, null);
		}
		return n;
	}

	// �رն���
	public static void release(Connection conn, Statement sta, ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed())
				rs.close();
		} catch (SQLException e) {
			System.out.println("rs�ر��쳣");
			e.printStackTrace();
		}

		try {
			if (sta != null && !sta.isClosed())
				sta.close();
		} catch (SQLException e) {
			System.out.println("st�ر��쳣");
			e.printStackTrace();
		}

		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			System.out.println("conn�ر��쳣");
			e.printStackTrace();
		}
	}
}