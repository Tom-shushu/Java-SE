package pro0414.b;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringDemo {

	//如何产生String字符串
	public void a(){
		String str1 = "abcd";
		String str2 = new String("abcd");
		char[] c = {97,98,99,100};
		String str3 = new String(c);
		String str4 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str1=="abcd");
		System.out.println(str2=="abcd");
		System.out.println(str3=="abcd");
		System.out.println(str4=="abcd");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
	}
	
	public void b(){
		String str1 = "abcd";
		
		String str2 = str1.concat("b我b");
		
		String str3 = str1 + "bbb";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		int length = str1.length();
		int length1 = str2.length();
		
		System.out.println(length);
		System.out.println(length1);
		
		System.out.println("-----------------------");
		
		String str4 = new String("abc");
		String str5 = new String("aBc");
		
		System.out.println(str5==str4);
		System.out.println(str5.equals(str4));
		System.out.println(str5.equalsIgnoreCase(str4));

		System.out.println("-----------------------");
		String str6 = "abCdEfG";
		String str61 = str6.toLowerCase();
		String str62 = str6.toUpperCase();
		System.out.println(str6+"\t"+str61+"\t"+str62);
		
		char c[] = str6.toCharArray();
		System.out.println(Arrays.toString(c));
		

		System.out.println("-----------------------");
		
		char m = str6.charAt(3);
		System.out.println(m);
		
	}
	
	public void c(){
		String str = "sus9fasufa9w";
		
		char ch = '9';
		String ch2 = "fa";
		
		int index1 = str.indexOf(ch);
		int index2 = str.indexOf(ch2);
		
		int index3 = str.lastIndexOf(ch);
		int index4 = str.lastIndexOf(ch2);
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(index4);

		System.out.println("-----------------------");
		String str2 = "  sss   wwww   bbbb  dddd     ";
		String str3 = str2.trim();
		
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str2.replace(" ", "");
		System.out.println(str4);
		String str5 = str2.replace("87", "t");
		System.out.println(str5);
		
		String str6 = "zhangsan.txt";
		
		boolean b1 = str6.toLowerCase().endsWith(".txt");
		System.out.println(b1);
		
	}
	
	public void d(){
		String str = "sdfjdfsdukfefrf";

		String n = str.substring(2,4);
		System.out.println(n);
		
		
		String str1 = null;
		String str2 = "";
		
		String str3 = new String();
		
		
		boolean b1 = str1==null;
		boolean b2 = str2.isEmpty();
		System.out.println(b1);
		System.out.println(b2);
		
	}
	
	public void e(){
		String name = "_1";
		boolean b = Pattern.matches("[0-9a-zA-Z][0-9]",name);
		System.out.println(b);
		//使用正则判断邮箱,身份证和电话
	}
	
	
	public static void main(String[] args) {
		new StringDemo().e();
	}
}
