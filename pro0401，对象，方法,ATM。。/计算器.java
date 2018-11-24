package pro0401;

import java.util.Scanner;
//1.0版本
public class 计算器 {

	double a, b;

	String f;
	
	Scanner in ;
	
	//alt+/
	public 计算器() {
		in = new Scanner(System.in);
	}
	
	public void 输入值(){
		System.out.println("请输入2个数:");
		a = in.nextDouble();
		b = in.nextDouble();
		
		//调用 另一个方法
		this.输入操作符();
		
	}
	
	
	//调用,模块化开发
	public void 输入操作符(){
		System.out.println("请输入操作:");
		f = in.next();
		
		switch (f) {
		case "+":
			this.加法();
			break;
		case "-":
			this.减法();
			break;
		case "*":
			this.乘法();
			break;
		case "/":
			this.除法();
			break;
		case "%":
			this.求余();
			break;

		default:
			System.out.println("输入不正确,请重新输入:");
			this.输入操作符();//递归
			break;
		}
		
	}
	
	public void 加法(){
		System.out.println(a+b);
	}
	
	public void 减法(){
		System.out.println(a-b);
	}
	
	public void 乘法(){
		System.out.println(a*b);
	}
	
	public void 除法(){
		System.out.println(a/b);
	}
	
	public void 求余(){
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		计算器 j = new 计算器();
		j.输入值();
	}
}
