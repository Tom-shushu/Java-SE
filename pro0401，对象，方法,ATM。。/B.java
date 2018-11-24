package pro0401;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		//小明要参加歌唱比赛,先进行彩排,如果可以就不用继续唱
		Scanner in = new Scanner(System.in);
		int ask ;
		do {
			System.out.println("你看我唱的是否可以?");
			ask = in.nextInt();
		} while (ask==0);
	
		System.out.println("可以休息了!");
	}
}
