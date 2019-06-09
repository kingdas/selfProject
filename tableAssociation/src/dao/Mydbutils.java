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
	 * 读取配置文件数据
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
	 * 注册驱动
	 */
	static {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			System.out.println("驱动注册失败");
			e.printStackTrace();
		}
	}

	/**
	 * 获取数据库的连接对象
	 * 
	 * @return 连接对象
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
	 * 执行查询
	 * 
	 * @param sql
	 * @param cls实体类
	 * @return 集合
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
	 * 把结果集转换成集合
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
				o = cls.newInstance();// 每循环一次得到一条记录，把这条记录的各列设到对应的实体对象所对应的属性中
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
	 * 执行查询
	 * 
	 * @param sql
	 * @return 结果集
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
	 * 执行增删改
	 * 
	 * @param sql
	 * @return 受影响的行数
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