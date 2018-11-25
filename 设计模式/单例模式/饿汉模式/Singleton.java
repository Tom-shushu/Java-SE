package 单例模式.饿汉模式;

public class Singleton {

	// 第二步:创建一个私有的静态变量,这个变量类型为当前类型,如果声明时赋值,就是饿汉模式
	private static Singleton instance = new Singleton();
	
	// 第一步:构造器私有化
	private Singleton(){}
	
	// 第三步:一个静态的公开的方法返回当前对象
	public static Singleton getInstance(){
		return instance;
	}
}
