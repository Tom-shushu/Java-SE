package biz;
//业务包:负责处理相应客户业务

import java.util.List;

import bean.UserInfo;
import dao.UserInfoDAO;

public class UserBiz {

	private UserInfoDAO uidao = new UserInfoDAO();

	public void saveUser(UserInfo ui) {
		uidao.saveUser(ui);
	}

	public void updateUser(UserInfo ui) {
		uidao.updateUser(ui);
	}

	public Object[][] findAllUser() {
		List<UserInfo> list = uidao.findAllUser();
		Object[][] rows = new Object[list.size()][5];
		for (int i = 0; i < rows.length; i++) {
			UserInfo ui = list.get(i);
			rows[i][0] = ui.getUserId();
			rows[i][1] = ui.getUserName();
			rows[i][2] = ui.getUserSex();
			rows[i][3] = ui.getUserAge();
			rows[i][4] = ui.getUserAddress();
		}
		return rows;
	}

	public Object[][] findUserByName(String userName){
		List<UserInfo> list = uidao.findUserByName(userName);
		Object[][] rows = new Object[list.size()][5];
		for (int i = 0; i < rows.length; i++) {
			UserInfo ui = list.get(i);
			rows[i][0] = ui.getUserId();
			rows[i][1] = ui.getUserName();
			rows[i][2] = ui.getUserSex();
			rows[i][3] = ui.getUserAge();
			rows[i][4] = ui.getUserAddress();
		}
		return rows;
	}
	
	public Object[][] findUserByPage(int page,int size){
		List<UserInfo> list = uidao.findUserByPage(page, size);
		Object[][] rows = new Object[list.size()][5];
		for (int i = 0; i < rows.length; i++) {
			UserInfo ui = list.get(i);
			rows[i][0] = ui.getUserId();
			rows[i][1] = ui.getUserName();
			rows[i][2] = ui.getUserSex();
			rows[i][3] = ui.getUserAge();
			rows[i][4] = ui.getUserAddress();
		}
		return rows;
	}
}
// 页面--->控制层(Servlet)--->业务层(Biz)--->数据层(DAO)