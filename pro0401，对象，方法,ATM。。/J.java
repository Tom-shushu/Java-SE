package pro0401;

public class J {

	//调用这个方法,什么都得不到,仅仅只是执行了方法体
	public void a(){
		System.out.println("aaaaaaaaa");
	}
	
	//调用这个方法,能够得到'一'个int类型的值,并且执行了方法体
	public int b(){
		System.out.println("bbbbbbbbb");
		return 5;
	}
	
	public String c(){
		System.out.println("ccccccccc");
		return "ccc";
	}
	
	public static void main(String[] args) {
		J j = new J();
		j.a();
		
		int b = j.b();
		System.out.println(b);
		
		String c = j.c();
		System.out.println(c);
		
	}
}
