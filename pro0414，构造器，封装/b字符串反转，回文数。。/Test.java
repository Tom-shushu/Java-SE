package pro0414.b;

import java.util.Scanner;

public class Test {


	Scanner in = new Scanner(System.in);
	//任意输入一个字符串,将它反转回来
	public void a(){
		System.out.println("请输入:");
		String str = in.nextLine();
		int len = str.length();
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	//任意输入一个字符串,判断它是否是回文数
	public void b(){
		System.out.println("请输入:");
		String str = in.nextLine();
		boolean b = true;
		int len = str.length()/2;
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				b = false;
				break;
			}
		}
		if(b){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
		
		
	}
	
	public static void main(String[] args) {
		new Test().b();
	}

}
