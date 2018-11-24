package db;
//负责打开数据库连接,负责关闭数据库连接

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.jdbc.Driver;
public class DBManager{
	
	//获取到数据库连接的方法
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(Driver.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("没有找到驱动类!");
		}
		
		ResourceBundle bundle = ResourceBundle.getBundle("my");

		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	//关闭数据库连接的方法,负责查询关闭
	public static void closeConnection(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	//关闭数据库连接的方法,负责更新关闭
	public static void closeConnection(Connection conn,PreparedStatement ps){
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
