package pro0513;
//第二种线程的实现方式
public class DemoB {
	public static void main(String[] args) {
		DemoBA a = new DemoBA();
		DemoBB b = new DemoBB();
		//这种方式创建的线程,必须借助于Thread
		Thread ta = new Thread(a);
		Thread tb = new Thread(b);
		ta.start();
		tb.start();
	}
}
class DemoBA implements Runnable{
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("A:"+i);
		}
	}
}

class DemoBB implements Runnable{
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("B:"+i);
		}
	}
}