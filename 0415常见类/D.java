package pro0415;

import java.util.Calendar;

//日历类
public class D {

	public static void main(String[] args) {
		//获取到当前日期
		Calendar rightNow = Calendar.getInstance();
		//获取到年月日时分秒星期
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date = rightNow.get(Calendar.DATE);
		int hour1 = rightNow.get(Calendar.HOUR);
		int hour2 = rightNow.get(Calendar.HOUR_OF_DAY);
		int minutes = rightNow.get(Calendar.MINUTE);
		int second = rightNow.get(Calendar.SECOND);
		int day = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(hour1);
		System.out.println(hour2);
		System.out.println(minutes);
		System.out.println(second);
		System.out.println(day);
	}
}
