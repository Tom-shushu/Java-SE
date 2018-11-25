package dao.onetomany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.onetomany.ClassInfo;
import db.DBManager;

public class ClassInfoDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public List<ClassInfo> findAllClass(){
		List<ClassInfo> list = new ArrayList<ClassInfo>();
		String sql = "select * from classinfo";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				ClassInfo ci = new ClassInfo();
				ci.setClassId(rs.getInt(1));
				ci.setClassName(rs.getString(2));
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
