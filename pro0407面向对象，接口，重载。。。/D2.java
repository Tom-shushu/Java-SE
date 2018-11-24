package pro0407;

public class D2 {

	String name1 = "aaa";// 成员变量
	static String name2 = "bbb";// 类变量
	// 规范,常量名全大写
	public final static int AGE = 19;
	public final static double PI = 3.1415926;

	// 块(静态块):类似于方法体,会在类被加载时依次执行
	static {
		System.out.println("aaaa");
		b();
	}

	static {
		for (int i = 0; i < 8; i++) {
			System.out.println(i);
		}
	}


	public void a() {
		System.out.println("aaaaa");
	}

	public void c() {
		b();
	}

	public static void b() {
		// System.out.println(name1);
		System.out.println(name2);
		System.out.println("bbbbb");
	}

	public static void main(String[] args) {
		

	}

}
