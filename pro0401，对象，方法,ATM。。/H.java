package pro0401;

public class H {

	
	public static void main(String[] args) {
		//如何创建一个对象 new
		//类 对象名 = new 类(构造器);
		//1.产生对象
		Student s1 = new Student();
		//2.赋值操作,针对的是属性 .
		s1.name = "张三";
		s1.age = 19;
		s1.sex = '男';
		//3.调用方法   .
		s1.介绍();
		s1.吃饭();
		s1.学习();
		
		
		Student s2 = new Student();
		s2.name = "李四";
		s2.age = 18;
		s2.sex = '女';
		s2.介绍();
		s2.吃饭();
		s2.学习();
		
	}
}
