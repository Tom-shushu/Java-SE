package pro0331;

public class D {

	public static void main(String[] args) {

		int a = 9;

		float b = 9.6F;

		double c = 9.4d;
		//将a变量的值赋予b变量,自动的将整型(int)---->单精度浮点型(float)
		b = a;
		//注意:不能将单精度浮点型(float)---->整型(int)
		//a = b;
		//强制类型转换
		a = (int)b;
		
		System.out.println(b);
		System.out.println(a);
		

		//从小的自动转换成大的
		
		
		byte m1 = 9;
		int m2 = m1;
		
		
		
		System.out.println(m2);
		
		int n1 = 999;
		byte n2 = (byte)n1; 

		//System.out.println(n2);
		
		//char--->int
		char c1 = 'a';
		int i1 = c1;
		
		System.out.println(i1);
		
		//int--->char
		int i2 = 97;
		char c3 = 97;
		char c2 = (char)i2;

		System.out.println(c2);
		
		
		//String
		
		int s1 = 9;
		float s2 = 9.1f;
		double s3 = 9.9;
		char s4 = 'b';
		long s5 = 777l;
		
		String ss1 = s1 + "";
		String ss2 = s2 + "";
		String ss3 = s3 + "";
		String ss4 = s4 + "";
		String ss5 = s5 + "";
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println(ss4);
		System.out.println(ss5);
		
		
		
		
		
		
	}
}
