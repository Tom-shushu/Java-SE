package pro0422.list;

public class Student implements Comparable<Student>{

	private Integer stuNo;//private int stuNo;
	private String stuName;
	private Integer stuAge;
	private String stuSex;

	public Student(int i) {
		stuNo = i+1;
		int k = (int)(Math.random()*2+2);
		stuName = "";
		for (int j = 0; j < k; j++) {
			char c = (char)((int)(Math.random()*5000+20000));
			stuName+=c;
		}
		stuAge = (int)(Math.random()*30+18);
		stuSex = (k%2==0)?"男":"女";
	}

	public Integer getStuNo() {
		return stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex + "]";
	}

	//通过重写equals方法来实现 只要对象的编号相同,对象就是相同的
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		boolean b = stu.getStuNo() .equals(this.getStuNo());
		return b;
	}
	

	//这个方法的作用是排序
	/*public int compareTo(Student o) {
		int result = this.getStuAge()-o.getStuAge();
		System.out.println("开始比较:"+this.getStuNo()+"和"+o.getStuNo()+"的年龄");
		return result;
	}*/

	//对list集合进行排序,首先按照年龄排序,如果年龄相等,按照编号排序
	public int compareTo(Student o) {
		int k = 0;
		
		int result = this.getStuAge() - o.getStuAge();
		if(result!=0){
			k = result;
		}else{
			k = this.getStuNo()-o.getStuNo();
		}
		
		return k;
	}
}
