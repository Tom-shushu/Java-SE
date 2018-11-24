package pro0421.b;

public class F {

	public void a() throws Exception {//声明异常,申明扔出去的异常时什么类型异常

		int i = 9 / 0;

		System.out.println(i);
		throw new Exception();//扔出去异常,扔的时候需要扔对象

	}

	public static void main(String[] args) {
		F f = new F();
		try {
			f.a();
		} catch (Exception e) {
			String str = e.getMessage();
			System.out.println(str);
			System.out.println("----------------------");
			e.printStackTrace();
		}
	}

}
