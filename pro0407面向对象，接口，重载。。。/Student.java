package pro0407;

public class Student {

	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "姓名:" + name + ",年龄:" + age;
	}

}
