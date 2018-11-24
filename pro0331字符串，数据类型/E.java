package pro0331;

public class E {

	public static void main(String[] args) {
		
		
		int i = 9;//将9的值赋予i
		int j = 10;
		
		
		String str1 = "abcd";
		String str2 = "abcd";
				
		
		//==比较两边值(地址)
		boolean b1 = i==j;
		
		boolean b2 = str1==str2;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int a1 = 9;
		int a2 = 11;
		System.out.println(a1>a2);
		
		boolean b3 = 'a'>'b';
		
		System.out.println(b3);
		
		boolean b4 = true;
		
		System.out.println(!b4);
		System.out.println(true&&false);
		System.out.println(true||false);
		System.out.println(true&&false||true);
		System.out.println(true||false&&true);
		
		//二元运算符
		int two1 = 9;
		//System.out.println(two1++);
		//System.out.println(++two1);
		
		System.out.println((two1++)+(two1++));
		
		
		int two2 = 8;
		
		two2+=7; //two2 = two2 + 7;
		two2-=7; //two2 = two2 - 7;
		two2*=7; //two2 = two2 * 7;
		two2/=7; //two2 = two2 / 7;
		two2%=7; //two2 = two2 % 7;
		
		
		System.out.println(7.9%3.2);
		//1363
		System.out.println(9+4+"6"+3);
		
		
		System.out.println(i>j?3:4);
		
		
		System.out.println("-----------------------");
	
		
		System.out.println(2<<3);


	}
}
