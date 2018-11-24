package pro0331;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("输入一个代表年月日的8位整数");
		
		int day = in.nextInt();
		
		int year = day/10000;
		int month = day/100%100;
		int date = day%100;
		
		switch (month) {
		case 1:
			if(date==1){
				System.out.println("上一天:"+(year-1)+"-12-31");
				System.out.println("下一天:"+year+"-"+month+"-"+(date+1));
			}else if(date==31){
				
			}else{
				
			}
			break;

		default:
			break;
		}
		
	}

}
