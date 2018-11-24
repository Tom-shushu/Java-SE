package pro0331;
//告诉程序 Scanner 出自哪里(出处)
import java.util.Scanner;
public class C {


	public static void main(String[] args) {
		//1.引入键盘对象 双飞燕
		Scanner 双飞燕 = new Scanner(System.in);
		
		//2.接收键盘输入
		int i = 双飞燕.nextInt();//接收了键盘的整型值
		String s = 双飞燕.next();//字符串
		double d = 双飞燕.nextDouble();//浮点型
		System.out.println(i);
		System.out.println(s);
		System.out.println(d);
		
	}
}
