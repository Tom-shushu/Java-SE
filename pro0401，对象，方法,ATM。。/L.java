package pro0401;

public class L {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.介绍();
		
		System.out.println("----------------------");
		Person p1 = new Person("张三");
		p1.介绍();
	}
}