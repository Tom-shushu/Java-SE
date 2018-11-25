package 单例模式.懒汉模式;

// 使用时,才new
public class Singleton {

	private static Singleton instance;
	
	private Singleton(){}
	
	// 进行了多线程的优化操作
	public static Singleton getInstance(){
		// 双重验证机制
		if(instance==null){
			synchronized (Singleton.class) {
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
