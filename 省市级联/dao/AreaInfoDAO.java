package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.AreaInfo;
import db.DBManager;

public class AreaInfoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs ;
	
	public List<AreaInfo> findByCityId(String cityId){
		List<AreaInfo> list = new ArrayList<AreaInfo>();
		String sql = "select * from areas where cityId=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cityId);
			rs = ps.executeQuery();
			while(rs.next()){
				AreaInfo ai = new AreaInfo();
				ai.setId(rs.getInt(1));
				ai.setAreaId(rs.getString(2));
				ai.setAreaName(rs.getString(3));
				list.add(ai);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		
		
		return list;
	}
	
}
