package pro0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DemoC {

	public static void main(String[] args) {
		//1.加载驱动
		try {
			Class.forName(Driver.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			//2.建立连接
			String url = "jdbc:mysql://localhost:3307/db1";
			String user = "root";
			String password = "a123456";
			Connection conn = DriverManager.getConnection(url, user, password);
			//3.产生传递SQL命令的对象
			String sql = "select * from demo";
			PreparedStatement ps = conn.prepareStatement(sql);
			//4.获取结果集
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//rs --->一行数据
				int id = rs.getInt(1);//获取到第一列的内容,因为第一列是Int型,所以用getInt();
				String name = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println(id+"\t"+name+"\t"+age);
			}
			
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
