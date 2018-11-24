package pro0415;

//封装类：8个，对应的是8大原始数据类型
public class F {

	public static void main(String[] args) {
		//Integer就是int的封装类
		//拆箱装箱操作
		int a = 9; 
		Integer b = Integer.valueOf(9);
		
		//8个原始数据类型和String类型之间的转换问题
		String s1 = "029";
		int s2 = Integer.parseInt(s1);//重点
		short s3 = Short.parseShort(s1);
		byte s4 = Byte.parseByte(s1);
		long s5 = Long.parseLong(s1);
		double s6 = Double.parseDouble(s1);
		float s7 = Float.parseFloat(s1);
		//8大原始类型--->String
		String s21 = String.valueOf(s2);
		String s22 = s2+"";
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		//进制之间的显示
		String binary = Integer.toBinaryString(5);
		String octal = Integer.toOctalString(9);
		String hex = Integer.toHexString(27);
		String num = Integer.toString(13);
		System.out.println("----------------------");
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hex);
		System.out.println(num);
		System.out.println("----------------------");
		
		System.out.println(min+"\t"+max);
		

		/*System.out.println(a + 1);
		System.out.println(b + 1);*/

	}
}
