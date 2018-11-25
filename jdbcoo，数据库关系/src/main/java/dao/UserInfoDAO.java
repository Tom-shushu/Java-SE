package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.UserInfo;
import db.DBManager;

//�������ݿ��CRUD
public class UserInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// �������
	public void saveUser(UserInfo ui) {
		String sql = "insert into userinfo values(null,?,?,?,?)";

		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUserName());
			ps.setString(2, ui.getUserSex());
			ps.setInt(3, ui.getUserAge());
			ps.setString(4, ui.getUserAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps);
		}
	}

	// �����޸�
	public void updateUser(UserInfo ui) {
		String sql = "update userinfo set username=?,usersex=?,userage=?,useraddress=? where userid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUserName());
			ps.setString(2, ui.getUserSex());
			ps.setInt(3, ui.getUserAge());
			ps.setString(4, ui.getUserAddress());
			ps.setInt(5, ui.getUserId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps);
		}
	}

	// ����ɾ��
	public void deleteUser(int userId) {
		String sql = "delete from userinfo where userid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps);
		}
	}

	// �����ѯ:ȫ��ѯ
	public List<UserInfo> findAllUser() {
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserInfo ui = new UserInfo();
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserSex(rs.getString(3));
				ui.setUserAge(rs.getInt(4));
				ui.setUserAddress(rs.getString(5));
				list.add(ui);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		return list;
	}

	// �����ѯ:ģ����ѯ
	public List<UserInfo> findUserByName(String userName) {
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo where username like ?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + userName + "%");
			rs = ps.executeQuery()
;
			while (rs.next()) {
				UserInfo ui = new UserInfo();
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserSex(rs.getString(3));
				ui.setUserAge(rs.getInt(4));
				ui.setUserAddress(rs.getString(5));
				list.add(ui);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		return list;
	}

	/**
	 * ʵ����UserInfo��ķ�ҳ����
	 * @param page ��ǰҳ��
	 * @param size ÿҳ��ʾ������
	 * @return
	 */
	public List<UserInfo> findUserByPage(int page,int size){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo limit ?,?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*size);
			ps.setInt(2, size);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserInfo ui = new UserInfo();
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserSex(rs.getString(3));
				ui.setUserAge(rs.getInt(4));
				ui.setUserAddress(rs.getString(5));
				list.add(ui);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBManager.closeConnection(conn, ps, rs);
		}
		return list;
	}
}
