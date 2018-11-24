package pro0513;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class DemoG {

	public static void main(String[] args) {
		// 定时器
		Timer timer = new Timer();
		/*
		 * timer.schedule(操作, 延迟); timer.schedule(操作, 延迟, 间隔);
		 * timer.schedule(操作, 时间); timer.schedule(操作, 时间, 间隔);
		 */
		DemoGA a = new DemoGA();
		//timer.schedule(a, 3000);
		//timer.schedule(a, 3000, 1000);
		
		Date date = new Date(new Date().getTime()+2000);
		System.out.println(date);
		timer.schedule(a, date,1000);
	}
}

// 操作类---->定时器中的操作类
class DemoGA extends TimerTask {
	public void run() {
		System.out.println("执行了操作!");
	}
}
