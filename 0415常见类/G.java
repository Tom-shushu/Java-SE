package pro0415;

public class G {

	public static void main(String[] args) {
		
		double d1 = Math.PI;
		double d2 = Math.E;
		System.out.println(d1);
		System.out.println(d2);
		
		double d3 = 8.97;
		double d4 = Math.floor(d3);
		double d42 = Math.ceil(d3);
		System.out.println(d4);
		System.out.println(d42);

		double d5 = Math.random();//[0,1)
		System.out.println(d5);
		
		
		int r = (int)(Math.random()*6+1);
		System.out.println(r);
	}//7-15
}

