package pro0407.oo;

public class B extends A{

	public B() {
		//调用指定的父类构造器
		//super(45); super();
		System.out.println("子类被创建了!");
		
	}
	
	public void a(){
		super.a();//调用父类的方法
		System.out.println("儿子说的话!");
	}
}
