package pro0407.oo;

public class Test{

	public void a(){
		Book b = new Book();

		b.setBookName("红楼梦");
		b.setBookPage(-199);
		b.setBookPrice(99.8);
		
		System.out.println(b);
	}

	public void b(){
		儿子 e = new 儿子();
		e.民族 = "回族";
		
		e.介绍();
	}
	
	public void c(){
		A b = new B();
		b.a();
	}
	//形式参数通用
	public void d(司机 sj){
		sj.启动();
		sj.停止();
		sj.toString();
	}
	
	public void e(){
		重载 c = new 重载();
		c.a(4,"a");
	}
	
	
	public static void main(String[] args) {
		//实际参数具体
		//司机 sj1 = new 出租车司机("张三");
		System.out.println(true);
		Test t = new Test();
		t.e();
	}

}
