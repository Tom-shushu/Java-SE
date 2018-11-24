package pro0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DemoB {

	public static void main(String[] args) {
		try {
			Class.forName(Driver.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3307/db1";
		String user = "root";
		String password = "a123456";
		
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "update demo set d_name=?,d_age=? where d_no=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "张三");
			ps.setInt(2, 24);
			ps.setInt(3, 6);
			int num = ps.executeUpdate();
			System.out.println(num);
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
