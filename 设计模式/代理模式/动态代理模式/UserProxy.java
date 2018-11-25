package 代理模式.动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

// 这个就是一个代理类,负责代理UserMapper接口
public class UserProxy implements InvocationHandler {

	public static <T> T getMapper(Class<T> c) {
		Class[] t = { c };
		// 通过反射和代理的方式得到UserMapper接口的'实现类'
		Object obj = 
				Proxy.newProxyInstance(
						UserProxy.class.getClassLoader(), 
						t, 
						new UserProxy()
						);
		return (T) obj;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		if ("toString".equals(methodName)) {
			return proxy.getClass().getName();
		} else if ("addUser".equals(methodName)) {
			// 这里就是负责执行的地方
			System.out.println("开始执行添加操作");
			System.out.println(Arrays.toString(args));
			System.out.println("添加成功!");
			return proxy;
		} else if ("updateUser".equals(methodName)) {
			// 这里就是负责执行的地方
			System.out.println("开始执行修改操作");
			System.out.println(Arrays.toString(args));
			System.out.println("修改成功!");
			return proxy;
		} else if ("deleteUser".equals(methodName)) {
			// 这里就是负责执行的地方
			System.out.println("开始执行删除操作");
			System.out.println(Arrays.toString(args));
			System.out.println("删除成功!");
			return proxy;
		}
		return null;
	}

}
