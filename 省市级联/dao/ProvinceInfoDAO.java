package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ProvinceInfo;
import db.DBManager;

public class ProvinceInfoDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs ;
	
	public List<ProvinceInfo> findAllProv(){
		List<ProvinceInfo> list = new ArrayList<ProvinceInfo>();
		String sql = "SELECT * FROM provinces";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ProvinceInfo pi = new ProvinceInfo();
				pi.setId(rs.getInt(1));
				pi.setProvinceId(rs.getString(2));
				pi.setProvinceName(rs.getString(3));
				list.add(pi);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		return list;
	}
	
}
