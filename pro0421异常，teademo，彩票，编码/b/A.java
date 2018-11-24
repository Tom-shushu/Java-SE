package pro0421.b;
//空指针异常
public class A {

	
	public void a(String str){
		System.out.println(str.toLowerCase());
	}
	
	public void b(){
		a(null);
	}
	
	
	public static void main(String[] args) {
		
		
		new A().b();
		
	}
}
