package biz.manytomany;

import java.util.List;

import bean.manytomany.PowersInfo;
import bean.manytomany.UsersInfo;
import dao.manytomany.UsersInfoDAO;

public class UsersBiz {

	private UsersInfoDAO uidao = new UsersInfoDAO();

	public List<UsersInfo> findAllUser(){
		return uidao.findAllUser();
	}
	
	public static void main(String[] args) {
		UsersBiz ub = new UsersBiz();
		List<UsersInfo> list = ub.findAllUser();
		for (UsersInfo ui : list) {
			System.out.println("’À∫≈:"+ui.getUserName()+"\tÍ«≥∆:"+ui.getUserNickName());
			for (PowersInfo pi : ui.getPowerSet()) {
				System.out.print("\t"+pi.getPowerName());
			}
			System.out.println();
		}
	}
	
}
