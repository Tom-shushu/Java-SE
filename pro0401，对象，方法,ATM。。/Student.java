package pro0401;

//在Java中创建了一个类
public class Student {

	// 描述属性
	String name;
	char sex;
	int age;
	// .... 属性越多,描述的越清晰

	// 描述方法
	/*
	 * 作用域 返回类型 方法名(形式参数列表){ 方法体; }
	 */

	public void 学习() {
		System.out.println(name + "努力学习!");
	}

	public void 吃饭() {
		System.out.println(name + "准备吃饭");
	}

	public void 介绍() {
		System.out.println("我是:" + name + ",今年:" + age + "岁,性别:" + sex);
	}

}
