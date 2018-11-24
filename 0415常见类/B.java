package pro0415;

public class B {

	//如何产生对象
	public void a(){
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer("abcd");
		StringBuffer str3 = new StringBuffer(6);
		
		System.out.println(str1);

		System.out.println(str2);

		System.out.println(str3);
		
	}
	//最重要方法
	public void b(){
		StringBuffer str = new StringBuffer("abcd");
		
		str.append("a");
		str.append(9);
		str.append(true);
		str.append('w');
		str.append(new char[]{'a','b'});
		System.out.println(str);
		
		str.insert(2, "o");
		System.out.println(str);
		
		str.delete(1, 3);
		System.out.println(str);
		
		str.deleteCharAt(6);
		System.out.println(str);
		
		
	}
	
	//次重要方法
	public void c(){
		StringBuffer str = new StringBuffer("abcdfrffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
		str.reverse();
		System.out.println(str);
		
		int capacity = str.capacity();
		int len = str.length();
		System.out.println(capacity);
		System.out.println(len);
		
		str.setCharAt(2, 'm');
		System.out.println(str);
		
		//替换方法
		str.replace(3, 5, "aaa");
		System.out.println(str);
		
		//类型转换
		String str1 = "abcd";
		//将String--->StringBuffer
		StringBuffer str2 = new StringBuffer(str1);
		//将StringBuffer--->String
		String str3 = str2.toString();
		
	}
	public static void main(String[] args) {
		new B().c();
	}
}
