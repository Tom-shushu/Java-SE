package pro0512.d;

import java.lang.reflect.Constructor;

//获取对象(构造器)
public class DemoB {

	public static void main(String[] args) {

		try {
			String str = "pro0512.d.Demo";
			// 第一步:获取到类
			Class c = Class.forName(str);
			// 获取到构造器
			Constructor[] cons1 = c.getConstructors();
			Constructor[] cons2 = c.getDeclaredConstructors();

			// 获取到指定的构造器
			Class[] 形参列表1 = {};
			Class[] 形参列表2 = { String.class };
			Constructor con1 = c.getConstructor(形参列表1);

			Constructor con2 = c.getDeclaredConstructor(形参列表2);

			// 获取到对象
			Object[] 实参列表1 = {};
			Object[] 实参列表2 = { "aaa" };
			Object obj1 = con1.newInstance(实参列表1);
			Object obj2 = con2.newInstance(实参列表2);

			//获取对象的简写形式,这种方式只能通过调用无参数构造器产生
			Object obj3 = c.newInstance();
			
			System.out.println(obj1 + "\t" + obj2 + "\t" + obj3);
			System.out.println(cons1.length + "\t" + cons2.length);
			System.out.println(con1);
			System.out.println(con2);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "1");
		}

	}

}
