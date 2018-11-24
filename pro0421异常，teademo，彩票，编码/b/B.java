package pro0421.b;

//下标越界异常
public class B {

	public void a(){
		int [] a = new int[6];
		System.out.println(a[9]);
	}
	
	public void b(){
		String str = "abcd";
		System.out.println(str.charAt(8));
	}
	
	public static void main(String[] args) {
		
		new B().b();
	}
	
}
