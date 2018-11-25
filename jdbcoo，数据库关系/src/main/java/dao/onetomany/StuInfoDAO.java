package dao.onetomany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import bean.onetomany.StuInfo;
import db.DBManager;

public class StuInfoDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	/**
	 * 根据班级编号,获取到这个班级的所有学员
	 * 
	 * @return
	 */
	public Set<StuInfo> findByClassId(int classId) {
		Set<StuInfo> set = new HashSet<StuInfo>();
		String sql = "SELECT * FROM stuinfo WHERE classid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, classId);
			rs = ps.executeQuery();
			while (rs.next()) {
				StuInfo si = new StuInfo();
				si.setStuId(rs.getInt(1));
				si.setStuName(rs.getString(2));
				si.setStuSex(rs.getString(3));
				si.setStuAge(rs.getInt(4));
				si.setStuAddress(rs.getString(5));
				set.add(si);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		return set;
	}

}
