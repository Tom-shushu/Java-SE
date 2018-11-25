package 单例模式.饿汉模式;

public class WorkTest {

	public static void main(String[] args) {
		Work work = Work.getWork();
		for (int i = 1; i < 11; i++) {
			new T(work).start();
		}
		
	}
}
class T extends Thread{
	private Work work;
	public T(Work work) {
		this.work = work;
	}
	public void run() {
		work.sequence();
	}
}
