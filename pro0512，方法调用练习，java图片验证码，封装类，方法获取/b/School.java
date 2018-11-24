package pro0512.b;

public class School implements Intro{

	private Print print = new Print();
	
	public String detail(){
		
		return "我是学校";
	}
	//看成是一种规范了
	public void print(Intro intro){
		print.print(intro.detail());
	}
	
}
