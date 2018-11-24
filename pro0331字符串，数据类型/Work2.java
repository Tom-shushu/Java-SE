package pro0331;

import java.util.Scanner;

//2.用户输入一个代表年月日的8位整数,
//判断这个日期是第几季度,并且判断是否是闰年
public class Work2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("输入一个代表年月日的8位整数");
		
		int day = in.nextInt();
		
		int year = day/10000;
		int month = day/100%100;
		int date = day%100;
		
		if(year%400==0){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
		
		if(month==1||month==2||month==3){
			System.out.println("一季度");
		}else if(month==4||month==5||month==6){
			System.out.println("二季度");
		}else if(month==7||month==8||month==9){
			System.out.println("三季度");
		}else if(month==10||month==11||month==12){
			System.out.println("四季度");
		}
		
	}
}
