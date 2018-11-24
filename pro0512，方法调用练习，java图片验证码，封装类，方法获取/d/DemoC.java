package pro0512.d;

import java.lang.reflect.Field;

//属性
public class DemoC {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("pro0512.d.Student");	
			//获取到c类的属性
			Field[] fs1 = c.getFields();
			Field[] fs2 = c.getDeclaredFields();
			System.out.println("没有Declared:");
			for (int i = 0; i < fs1.length; i++) {
				System.out.println(fs1[i].getName());
			}
			System.out.println("------------------------------------");
			System.out.println("有Declared:");
			for (int i = 0; i < fs2.length; i++) {
				System.out.println(fs2[i].getName());
			}
			System.out.println("------------------------------------");
			Field f1 = c.getField("name");
			Field f2 = c.getDeclaredField("className");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
