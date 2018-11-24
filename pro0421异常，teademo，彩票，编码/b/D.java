package pro0421.b;


//类型转换异常
public class D {

	public void print(D1 d) {
		d.a();
	}

	public static void main(String[] args) {
		// 向上转型
		D d = new D1();//如果new的是D2,就会出现异常

		// 向下转型
		D1 d1 = (D1) d;
		
		new D().print(d1);
	}

}

class D1 extends D {
	public void a() {
		System.out.println("aaaaaaaa");
	}
}

class D2 extends D {
	public void b() {
		System.out.println("bbbbbbbb");
	}
}

// 几个注意:
// 1.一个Java文件中可以有多个类,但是只能有一个public的类,并且这个类名称和文件名完全相同