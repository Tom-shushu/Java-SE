package pro0407.oo;
//第一步:通过关键字extends 实现了子类继承父类
public class 儿子 extends 父亲{

	public int 年龄;
	
	//重写:子类重写父类的方法,重写方法体
	public void 介绍(){
		System.out.println("我的年龄是:" + 年龄 + ",民族:" + 民族);
	}
}

//1.子类只能继承父类可见级别的内容
//2.子类的方法如果跟父类方法定义一致,则重写父类方法
//3.