package pro0421.b;

//字符串转换数字异常
public class C {

	public void a(String str){

		int a = Integer.parseInt(str);
		
	}
	
	public void b(String str){
		a(str);
	}
	
	public void c(String str){
		b(str);
	}
	
	public static void main(String[] args) {
		new C().c("abcd");
	}
	
}
