package pro0401;

import java.util.Scanner;

public class Work3 {

	Scanner in = new Scanner(System.in);
	// 5.求出1!+2!+...+n!是多少？（使用while来做）
	public void a() {
		System.out.println("请输入n:");
		int n = in.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			int j = 1;
			int ji = 1;
			while (j <= i) {
				ji *= j;
				j++;
			}
			sum += ji;
			ji = 1;
			i++;
		}
		System.out.println(sum);
	}

	// 11.求出1000以内所有能被9整除的数，每行显示5个数
	public void b() {
		int count = 0;// 计数器
		for (int i = 1; i < 1000; i++) {
			if (i % 9 == 0) {
				System.out.print(i + "\t");
				count++;
			}
			if (count == 5) {
				System.out.println("");
				count = 0;
			}
		}
	}

	public void c() {
		for (int i = 97; i < 123; i++) {
			char a = (char) i;
			System.out.println(a);
		}

		System.out.println("---------------------");

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
	}

	// 14.使用for循环求出第一个数+第二个数=第三个数
	// 依此类推的 要求循环的次数是用户界面输入的
	// （初始定义第一个数为1，第二个数为1）
	// 然后打印出这个数列（斐波那契数）
	public void d() {
		int i = 1, j = 1;
		System.out.println("请输入n:");
		int n = in.nextInt();
		for (int k = 0; k < n; k++) {
			int m = i + j;
			System.out.println(m);
			//数字的交换
			//i 就是原来的j的值
			i = j;
			//j 就是m的值
			j = m;
		}
	}

	public static void main(String[] args) {
		Work3 w3 = new Work3();
		w3.d();
	}
}