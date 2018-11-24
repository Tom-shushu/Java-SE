package pro0407;

public class C {

	
	public void a(){
		//定义了一个数组,里边存放的内容为Student
		Student[] students = new Student[3];
		
		Student s1 = new Student("张三", 19);
		Student s2 = new Student("李四", 18);
		Student s3 = new Student("王五", 18);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		//数组存放的是引用
		s1.name = "张小三";
		
		//toString方式时默认方法,未指定调用哪个方法时,调用这个方法
		System.out.println(s1);
		System.out.println(students[0]);
		System.out.println(s1==students[0]);
	}
	
	
	public static void main(String[] args) {
		new C().a();
	}

}
