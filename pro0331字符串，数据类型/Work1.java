package pro0331;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入成绩:");
		
		int score = in.nextInt();
		
		if(score>100||score<0){
			System.out.println("你输入的成绩不符合要求!");
		}else{
			if(score==100){
				System.out.println("A");
			}else if(score>=85){
				System.out.println("B");
			}else if(score>=60){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}
		
	}
}
