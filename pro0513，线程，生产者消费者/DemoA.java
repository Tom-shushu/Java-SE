package pro0513;
//第一种创建线程的方式
public class DemoA {
	public static void main(String[] args) {
		DemoAA a = new DemoAA();//新建状态
		DemoAB b = new DemoAB();//新建状态
		a.start();//标明线程准备就绪
		b.start();//就绪状态
	}
}//为什么线程是通过run()方法执行,但是我们却调用的是start()
class DemoAA extends Thread{
	@Override
	public void run() {//当执行时,进入运行状态
		for (int i = 1; i < 11; i++) {
			System.out.println("A:"+i);
		}
	}//死亡状态
}

class DemoAB extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("B:"+i);
		}
	}
}