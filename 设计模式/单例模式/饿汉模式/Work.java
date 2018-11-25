package 单例模式.饿汉模式;

public class Work {

	private static Work work = new Work();
	
	private static int num = 1;
	
	private Work(){}
	
	public static Work getWork(){
		return work;
	}
	
	public synchronized void sequence(){
		System.out.println(num);
		num++;
	}
}
