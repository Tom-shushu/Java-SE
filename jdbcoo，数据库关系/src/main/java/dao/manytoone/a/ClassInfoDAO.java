package dao.manytoone.a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.manytoone.a.ClassInfo;
import db.DBManager;

public class ClassInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public List<ClassInfo> findAllClass(){
		List<ClassInfo> list = new ArrayList<ClassInfo>();
		
		conn = DBManager.getConnection();
		String sql = "select * from classinfo";
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
		} finally{
			DBManager.closeConnection(conn, ps, rs);
		}
		return list;
	}
	
	public ClassInfo findById(int classId){
		ClassInfo ci = new ClassInfo();
		String sql = "select * from classinfo where classid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, classId);
			rs = ps.executeQuery();
			if(rs.next()){
				ci.setClassId(rs.getInt(1));
				ci.setClassName(rs.getString(2));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally{
			DBManager.closeConnection(conn, ps, rs);
		}
		return ci;
		
	}
	
}
