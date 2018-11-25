package db;
//��������ݿ�����,����ر����ݿ�����

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.jdbc.Driver;
public class DBManager{
	
	//��ȡ�����ݿ����ӵķ���
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(Driver.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("û���ҵ�������!");
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
	
	//�ر����ݿ����ӵķ���,�����ѯ�ر�
	public static void closeConnection(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	//�ر����ݿ����ӵķ���,������¹ر�
	public static void closeConnection(Connection conn,PreparedStatement ps){
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
