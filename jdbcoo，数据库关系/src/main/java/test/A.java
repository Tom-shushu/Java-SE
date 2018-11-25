package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import bean.UserInfo;

public class A {

	public void a(Object obj) throws Exception{
		String a = "";
		String b = "";
		
		Field f[] = obj.getClass().getDeclaredFields();
		for (int i = 0; i < f.length; i++) {
			String fname = f[i].getName();
			String methodName = "get"+fname.substring(0,1).toUpperCase()+fname.substring(1);
			Method method = obj.getClass().getDeclaredMethod(methodName, new Class[]{});
			Object value = method.invoke(obj, new Object[]{});
			a+=fname+",";
			b+="'"+value+"',";
		}
		a = a.substring(0, a.length()-1);
		b = b.substring(0, b.length()-1);
		
		
		
		
		String sql = "insert into "+obj.getClass().getSimpleName()+"("+a+") values("+b+")";
		
		System.out.println(sql);
	}
	
	
	public static void main(String[] args) throws Exception {
		
		UserInfo ui = new UserInfo();
		ui.setUserAddress("西安");
		ui.setUserAge(28);
		ui.setUserId(3);
		ui.setUserName("张三");
		ui.setUserSex("男");
		
		new A().a(ui);
		
	}
	
}
