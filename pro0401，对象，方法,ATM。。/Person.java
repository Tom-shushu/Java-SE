package pro0401;

public class Person {

	String name;
	char sex;
	String bri;
	String address;
	
	//创建一个显性构造器
	/*
	作用域 类名(形式参数列表){
		构造方法体;
	}
	*/
	
	public Person(){
		sex = '男';
		bri = "2018-4-1";
	}
	
	public Person(String name){
		this.name = name;//this:代表当前类的对象
	}
	
	
	public void 介绍(){
		System.out.println(name);
		System.out.println(sex);
		System.out.println(bri);
		System.out.println(address);
	}
}
