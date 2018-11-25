package dao.manytomany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.manytomany.PowersInfo;
import bean.manytomany.UsersInfo;
import db.DBManager;

public class UsersInfoDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public List<UsersInfo> findAllUser(){
		List<UsersInfo> list = new ArrayList<UsersInfo>();
		String sql = "select * from users";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				UsersInfo ui = new UsersInfo();
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserPass(rs.getString(3));
				ui.setUserSex(rs.getString(4));
				ui.setUserNickName(rs.getString(5));
				Set<PowersInfo> powerSet = new HashSet<PowersInfo>();
				String sql2 = "SELECT * FROM powers WHERE powerid IN (SELECT powerid FROM user_power WHERE userid=?)";
				PreparedStatement ps2 = conn.prepareStatement(sql2);
				ps2.setInt(1, ui.getUserId());
				ResultSet rs2 = ps2.executeQuery();
				while(rs2.next()){
					PowersInfo pi = new PowersInfo();
					pi.setPowerId(rs2.getInt(1));
					pi.setPowerName(rs2.getString(2));
					pi.setPowerContent(rs2.getString(3));
					powerSet.add(pi);
				}
				ui.setPowerSet(powerSet);
				list.add(ui);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
}
