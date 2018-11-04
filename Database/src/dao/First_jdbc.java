package dao;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.*;

public class First_jdbc {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from user3");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "," + rs.getString("name") + "," + rs.getInt("groupid"));
		}
		rs.close();
		conn.close();
		stat.close();
	}
}
