package pro0401;

import java.util.Scanner;

public class Work1 {
	// 3.用户任意输入一个数,判断这个数是否是素数
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("請輸入一個数");

		int num = in.nextInt();

		int i = 2;

		boolean b = true;//标记法

		while (i < num) {
			if (num % i == 0) {
				System.out.println(num + "不是素数!");
				b = false;
				break;//提升效率
			}
			i++;
		}

		if (b) {
			System.out.println(num + "是素数!");
		}

	}

}
