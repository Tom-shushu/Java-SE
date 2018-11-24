package pro0421.b;

//自己写了一个类,这个类继承与Exception
public class G extends Exception{

	@Override
	public String getMessage() {
		return "出现了异常了!!";
	}
	
}
