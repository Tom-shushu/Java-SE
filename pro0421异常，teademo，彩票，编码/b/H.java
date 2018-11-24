package pro0421.b;

public class H {

	
	public void a(int len) throws G{
		//如果你传递过来的值大于7,就有异常
		if(len>7){
			throw new G();
		}
		System.out.println(len);
	}

	public static void main(String[] args) {
		try {
			new H().a(9);
		} catch (G e) {
			System.out.println(e.getMessage());
		}
	}

}
