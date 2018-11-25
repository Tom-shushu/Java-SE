package bean.manytoone.a;

public class StuInfo {

	private Integer stuId;
	private String stuName;
	private String stuSex;
	private Integer stuAge;
	private String stuAddress;
	//√Ë ˆ∂‡∂‘“ª
	private ClassInfo ci;
	
	public StuInfo() {
	}
	
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public ClassInfo getCi() {
		return ci;
	}
	public void setCi(ClassInfo ci) {
		this.ci = ci;
	}

	@Override
	public String toString() {
		return "StuInfo [stuId=" + stuId + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuAddress=" + stuAddress + ", ci=" + ci + "]";
	}
}
