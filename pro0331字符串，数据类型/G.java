package pro0331;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入按键:");
		
		int num = in.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("给爸爸打电话!");
			//break;
		case 2:
			System.out.println("给妈妈打电话!");
			break;
		case 3:
			System.out.println("给爷爷打电话!");
			break;
		case 4:
			System.out.println("给奶奶打电话!");
			break;
		default:
			System.out.println("输入有误!");
			break;
		}
		
	}
}
