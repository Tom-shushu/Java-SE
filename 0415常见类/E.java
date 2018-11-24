package pro0415;

import java.text.SimpleDateFormat;
import java.util.Date;

//格式化日期
public class E {

	
	public static void main(String[] args) {
		Date date = new Date();
		//格式化日期类
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String d = sdf.format(date);
		System.out.println(date);
		System.out.println(d);
	}
}
