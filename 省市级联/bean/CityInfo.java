package bean;

import java.util.Set;

public class CityInfo {

	private Integer id;
	private String cityId;
	private String cityName;
	private Integer provinceId;
	private Set<AreaInfo> areaSet;
	public CityInfo() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public Set<AreaInfo> getAreaSet() {
		return areaSet;
	}
	public void setAreaSet(Set<AreaInfo> areaSet) {
		this.areaSet = areaSet;
	}
	@Override
	public String toString() {
		return cityName;
	}
}
