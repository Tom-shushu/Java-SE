package bean.manytomany;

import java.util.Set;

public class PowersInfo {

	private Integer powerId;
	private String powerName;
	private String powerContent;
	private Set<UsersInfo> userSet;

	public PowersInfo() {
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String getPowerContent() {
		return powerContent;
	}

	public void setPowerContent(String powerContent) {
		this.powerContent = powerContent;
	}

	public Set<UsersInfo> getUserSet() {
		return userSet;
	}

	public void setUserSet(Set<UsersInfo> userSet) {
		this.userSet = userSet;
	}
}
