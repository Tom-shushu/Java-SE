package bean.manytoone.a;

public class ClassInfo {

	private Integer classId;
	private String className;

	public ClassInfo() {
		
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "ClassInfo [classId=" + classId + ", className=" + className + "]";
	}

}
