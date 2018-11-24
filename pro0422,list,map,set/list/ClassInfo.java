package pro0422.list;

import java.util.Comparator;

public class ClassInfo implements Comparable<ClassInfo> {

	private Integer classId;
	private String className;
	private Integer classNum;

	public ClassInfo() {

	}

	public ClassInfo(Integer classId, String className, Integer classNum) {
		super();
		this.classId = classId;
		this.className = className;
		this.classNum = classNum;
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

	public Integer getClassNum() {
		return classNum;
	}

	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}

	@Override
	public boolean equals(Object obj) {

		ClassInfo ci = (ClassInfo) obj;

		return ci.getClassId().equals(this.getClassId());
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return "ClassInfo [classId=" + classId + ", className=" + className + ", classNum=" + classNum + "]";
	}

	@Override
	public int compareTo(ClassInfo o) {

		return this.getClassNum() - o.getClassNum();
	}

}
