package pro0512.d;

public class Person {

	private Integer age;
	public String name;
	public Character sex;

	public void run() {
		System.out.println(name + "正在跑步");
	}

	public void sleep() {
		System.out.println(name + "在睡觉!");
	}

	public void detail() {
		System.out.println(name + "\t" + age + "\t" + sex);
	}
}
