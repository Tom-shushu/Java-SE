package pro0513;
//阻塞的两个常见方法
public class DemoE {

	public static void main(String[] args) {
		new DemoEB().start();
	}
}

class DemoEA extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			//将当前线程睡眠1秒钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class DemoEB extends Thread{
	//同步锁
	public synchronized void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			//每个一秒钟显示内容
			try {
				wait(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
