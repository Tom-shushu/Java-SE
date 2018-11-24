package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.CityInfo;
import db.DBManager;

public class CityInfoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs ;
	
	public List<CityInfo> findByProvinceId(String provinceId){
		String sql = "SELECT * FROM cities WHERE provinceid = ?";
		List<CityInfo> list = new ArrayList<CityInfo>();
		
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, provinceId);
			rs = ps.executeQuery();
			while(rs.next()){
				CityInfo ci = new CityInfo();
				ci.setId(rs.getInt(1));
				ci.setCityId(rs.getString(2));
				ci.setCityName(rs.getString(3));
				list.add(ci);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		
		return list;
	}
	
}
