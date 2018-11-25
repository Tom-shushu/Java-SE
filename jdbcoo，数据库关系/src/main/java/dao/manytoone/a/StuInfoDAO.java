package dao.manytoone.a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.manytoone.a.ClassInfo;
import bean.manytoone.a.StuInfo;
import db.DBManager;

public class StuInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public List<StuInfo> findAllStu(){
		List<StuInfo> list = new ArrayList<StuInfo>();
		String sql = "select * from stuInfo";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				StuInfo si = new StuInfo();
				si.setStuId(rs.getInt(1));
				si.setStuName(rs.getString(2));
				si.setStuSex(rs.getString(3));
				si.setStuAge(rs.getInt(4));
				si.setStuAddress(rs.getString(5));
				//°ëÀ­µÄci
				ClassInfo ci = new ClassInfo();
				ci.setClassId(rs.getInt(6));
				si.setCi(ci);
				list.add(si);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally{
			DBManager.closeConnection(conn, ps, rs);
		}
		return list;
	}
	
	
}
