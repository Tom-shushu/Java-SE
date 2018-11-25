package bean.manytomany;

import java.util.Set;

public class UsersInfo {

	private Integer userId;
	private String userName;
	private String userPass;
	private String userSex;
	private String userNickName;
	private Set<PowersInfo> powerSet;

	public UsersInfo() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public Set<PowersInfo> getPowerSet() {
		return powerSet;
	}

	public void setPowerSet(Set<PowersInfo> powerSet) {
		this.powerSet = powerSet;
	}
}
