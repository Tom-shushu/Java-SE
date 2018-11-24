﻿package pro0512.d;

import java.lang.reflect.Method;

public class DemoD {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("pro0512.d.Student");
			
			//获取方法
			Method[] ms1 = c.getMethods();
			Method[] ms2 = c.getDeclaredMethods();
			System.out.println("没有Declared:");
			for (int i = 0; i < ms1.length; i++) {
				System.out.println(ms1[i].getName());
			}
			System.out.println("------------------------------");
			
			System.out.println("有Declared:");
			for (int i = 0; i < ms2.length; i++) {
				System.out.println(ms2[i].getName());
			}
			
			Method m1 = c.getMethod("study", new Class[]{});
			
			//调用方法
			Object 返回值 = m1.invoke(c.newInstance(), new Object[]{});
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
