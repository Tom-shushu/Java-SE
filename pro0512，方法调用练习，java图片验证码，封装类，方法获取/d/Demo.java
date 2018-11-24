package pro0512.d;

//演示类
public class Demo {

	private String name;
	private Integer age;

	public Demo() {
		System.out.println("1");
	}

	public Demo(String name) {
		this.name = name;
		System.out.println("2");
	}

	public Demo(Integer age) {
		this.age = age;
		System.out.println("3");
	}

	public Demo(String name, Integer age) {
		this.name = name;
		this.age = age;
		System.out.println("4");
	}
	
	private Demo(Double m){
		System.out.println("5");
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", age=" + age + "]";
	}

}
