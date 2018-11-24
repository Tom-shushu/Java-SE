package pro0414.a;

public class Test {

	public void a(){
		B b = new B(4, 5, 6);
		b.print();
	}
	//equals和==的区别?
	public void b(){
		C c1 = new C();
		C c2 = new C();
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Test().b();
	}

}
