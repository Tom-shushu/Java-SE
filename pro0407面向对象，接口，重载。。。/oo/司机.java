package pro0407.oo;
//这是一个父类
public class 司机 {

	private String name;
	//第一种处理方法
	public 司机() {
		// TODO Auto-generated constructor stub
	}
	
	
	public 司机(String name) {
		this.name = name;
	}
	
	public void 启动(){
		System.out.println("姓名:"+name);
		System.out.println("开火");
		System.out.println("踩下油门");
	}
	
	public void 停止(){
		System.out.println("踩刹车");
	}
	
	
}
