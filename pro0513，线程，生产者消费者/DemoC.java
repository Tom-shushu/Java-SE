package pro0513;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//第三种线程的实现,它能够获取到线程的返回值
public class DemoC {
	public static void main(String[] args) {
		try {
			DemoCA a = new DemoCA();//产生了类对象
			DemoCB b = new DemoCB();
			FutureTask<Integer> ta = new FutureTask<Integer>(a);//将类的对象使用Future进行了包装
			FutureTask<Integer> tb = new FutureTask<Integer>(b);
			Thread threadA = new Thread(ta);//产生了一个线程对象
			Thread threadB = new Thread(tb);
			threadA.start();//线程就绪
			threadB.start();
			int ia = ta.get();//获取到了线程的返回值
			int ib = tb.get();
			System.out.println(ia + "\t" + ib);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
		}
	}
}

class DemoCA implements Callable<Integer> {//Integer是泛型,指定了返回值的类型
	public Integer call() throws Exception {
		int i = 1;
		for (; i < 11; i++) {
			System.out.println("A:" + i);
		}
		return i;
	}
}

class DemoCB implements Callable<Integer> {
	public Integer call() throws Exception {
		int i = 1;
		for (; i < 11; i++) {
			System.out.println("B:" + i);
		}
		return i;
	}
}