package pro0407.oo;

//第二种处理方法
public class 出租车司机 extends 司机{

	
	public 出租车司机(String name){
		super(name);
	}
	
	public 出租车司机(int age){
		super("");
	}
	
	public 出租车司机(){
		super("");
	}
	
	public 出租车司机(String name,int age){
		super(name);
	}
	
	//有一种表述
	public void 停止(){
		super.停止();
		System.out.println("停止计费!");
	}
}
