package pro0513;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class 抖动 extends JFrame{
	int x ;
	int i = 1;
	public 抖动() {
		setBounds(0, 0, 420, 200);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
		
		x = this.getX();
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(i%2==0){
					x = x - 20;
				}else{
					x = x + 20;
				}
				setBounds(x, getY(), getWidth(), getHeight());
			}
		}, 0,100);
		
	}
	
	public static void main(String[] args) {
		new 抖动();
	}
}


