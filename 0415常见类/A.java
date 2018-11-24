package pro0415;

import java.util.regex.Pattern;

public class A {
	public void a() {
		String str = "s";

		String p = "^[a-zb-m]$";

		boolean b = Pattern.matches(p, str);

		System.out.println(b);

	}

	public void b1() {
		String str = "a";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str += "a";
		}
		long end = System.currentTimeMillis();

		System.out.println("String执行毫秒数：" + (end - start));

	}

	public void b2() {
		StringBuffer str = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer执行毫秒数：" + (end - start));

	}

	public void c() {
		String str1 = "abcd";
		String str2 = "a" + "b" + "c" + "d";// abcd
		String str31 = "a", str32 = "b", str33 = "c", str34 = "d";
		String str3 = str31 + str32 + str33 + str34;

		final String str41 = "a";
		final String str42 = "b";
		final String str43 = "c";
		final String str44 = "d";

		String str4 = str41 + str42 + str43 + str44;

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
	}

	String a = "abcd";

	public void d() {
		String b = "a" + "b" + "c" + "d";
		System.out.println(a == b);
	}

	public static void main(String[] args) {
		new A().d();
	}
}
