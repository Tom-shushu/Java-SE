package pro0414.b;

import java.util.Scanner;

public class Test {


	Scanner in = new Scanner(System.in);
	//��������һ���ַ���,������ת����
	public void a(){
		System.out.println("������:");
		String str = in.nextLine();
		int len = str.length();
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	//��������һ���ַ���,�ж����Ƿ��ǻ�����
	public void b(){
		System.out.println("������:");
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
			System.out.println("�ǻ�����");
		}else{
			System.out.println("���ǻ�����");
		}
		
		
	}
	
	public static void main(String[] args) {
		new Test().b();
	}

}
