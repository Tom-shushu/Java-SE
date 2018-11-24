package pro0421.b;

import java.util.InputMismatchException;
import java.util.Scanner;

//如何去抓住异常
public class E {

	private Scanner in = new Scanner(System.in);

	// 情况一:有一段代码有可能出现异常,但是并没有出现,那么就不会执行catch中的内容
	// 情况二:有一段代码有可能出现异常,并且也出现,那么就会去执行catch中的内容
	public void a() {

		System.out.println("请输入除数:");
		int i = in.nextInt();

		try {// 使用try将可能出现异常的代码段括起来
			int b = 9 / i;

			System.out.println("结果:" + b);
		} catch (Exception e) {// 如果出现了异常,该怎么办
			System.out.println("你的除数不能为零!");
		}

		System.out.println("再见!");
	}

	// 情况三:有一段代码有可能出现异常,并且也出现了异常,但是出现的异常和catch中的异常不匹配
	public void b() {
		System.out.println("请输入除数:");
		int i = in.nextInt();
		try {
			int b = 9 / i;
			System.out.println("结果:" + b);
		} catch (NullPointerException e) {// 有对空指针异常的处理方案,但是如果是其他异常就不能匹配
			System.out.println("你的除数不能为零!");
		}
		System.out.println("再见!");
	}

	// 情况四:有一段代码有可能出现多种异常,那么需要使用Exception处理或者多个使用指定的类处理(推荐)
	public void c() {
		System.out.println("请输入除数:");
		try {
			int i = in.nextInt();
			int b = 9 / i;
			System.out.println("结果:" + b);
		} catch (ArithmeticException e) {// 匹配数学
			System.out.println("你的除数不能为零!");
		} catch (InputMismatchException e) {// 匹配输入内容
			System.out.println("你输入的数字不合法");
		} catch (Exception e) {
			System.out.println("有异常了!!");
		}

		// 先子类异常,后父类异常
		System.out.println("再见!");
	}

	// 情况五:不管发生任何事情,都会执行的代码块,在说finally
	public void d() {
		System.out.println("请输入除数:");
		int i = in.nextInt();
		try {
			int b = 9 / i;
			System.out.println("结果:" + b);
		} catch (Exception e) {
			System.out.println("你的除数不能为零!");
		} finally {
			System.out.println("不管发生任何事情,都会执行的代码块");
		}
		System.out.println("再见!");
	}

	public static void main(String[] args) {
		//final
		//finally
		//finalize();
		new E().d();
	}
}
