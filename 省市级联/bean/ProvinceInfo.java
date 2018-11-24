package bean;

import java.util.Set;

public class ProvinceInfo {

	private Integer id;
	private String provinceId;
	private String provinceName;
	//描述一对多
	private Set<CityInfo> citySet;
	
	public ProvinceInfo() {
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public Set<CityInfo> getCitySet() {
		return citySet;
	}
	public void setCitySet(Set<CityInfo> citySet) {
		this.citySet = citySet;
	}

	@Override
	public String toString() {
		return provinceName;
	}
}
