package pro0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DemoA {

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
			String sql = "delete from demo where d_no=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 3);
			int num = ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
