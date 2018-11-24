package A0428;

import java.util.ArrayList;
import java.util.List;

public   class Student implements Comparable<Student> {
private Integer stuNO;
private String stuName;
private Integer stuage;
private String stuSex;



public Student(int i) {
	stuNO = i+1;
	int k = (int)(Math.random()*2+2);
	
	
	stuName= "";
	for(int j=0;j<k;j++) {
		char c = (char)(int)(Math.random()*5000+20000);
		stuName+=c;
	}
	
	
	stuage = (int)(Math.random()*2+20);
	stuSex = (k%2==0)?"女":"男";
	
}




public Integer getStuNO() {
	return stuNO;
}
public void setStuNO(Integer stuNO) {
	this.stuNO = stuNO;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public Integer getStuage() {
	return stuage;
}
public void setStuage(Integer stuage) {
	this.stuage = stuage;
}
public String getStuSex() {
	return stuSex;
}
public void setStuSex(String stuSex) {
	this.stuSex = stuSex;
}




@Override
public String toString( ) {
	return "Student [stuNO=" + stuNO + ", stuName=" + stuName + ", stuage=" + stuage + ", stuSex=" + stuSex + "]";
}

//这个方法的作用数排序



public int compareTo1(Student o) {
	int result = this.getStuage()-o.getStuage();
	System.out.println(this.getStuage()  );
return result;
}




@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return 0;
}                 

/*public int compareTo(Student o) {
	int k =0;
	int result = this.getStuage()-o.getStuage();
	if(result !=0) {
		
	}
}*/                      






}
