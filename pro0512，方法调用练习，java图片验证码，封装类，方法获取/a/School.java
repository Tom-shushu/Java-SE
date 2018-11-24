package pro0512.a;

public class School {

	private Print print;
	
	public School() {
		print = new Print();
	}
	
	public void print(School s){
		print.print(s.detail());
	}
	
	public void print(Teacher t){
		print.print(t.detail());
	}
	
	public void print(Student s){
		print.print(s.detail());
	}
	
	public String detail(){
		return "这里是西安科技大学";
	}
	
}
