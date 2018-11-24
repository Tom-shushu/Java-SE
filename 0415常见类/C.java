package pro0415;

import java.util.Date;

//Date
public class C {

	
	public static void main(String[] args) {
		//获取到系统当前时间
		Date date1 = new Date();
		//获取到制定的时间（年：1900，月：0）
		Date date2 = new Date(118, 3, 15);
		//获取到比标准时间后多少毫秒的时间
		Date date3 = new Date(778798);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		int year = date1.getYear();
		int month = date1.getMonth();
		int date = date1.getDate();
		int hour = date1.getHours();
		int minutes = date1.getMinutes();
		int second = date1.getSeconds();
		int day = date1.getDay();
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(hour);
		System.out.println(minutes);
		System.out.println(second);
		System.out.println(day);
		
		long time = date1.getTime();
	}
	
}
//java.util.* Java工具包
//java.lang.* Java基础包