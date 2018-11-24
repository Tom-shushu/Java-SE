package pro0513;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class 钟表 extends JFrame {
	private JLabel jl;
	public 钟表() {
		jl = new JLabel(getNowDate());
		jl.setFont(new Font("", Font.BOLD, 40));
		add(jl);
		setBounds(0, 0, 420, 200);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
		Timer timer = new Timer();
		timer.schedule(new LabelChange(jl,this), 0, 1000);
	}
	public static void main(String[] args) {
		new 钟表();
	}
	public String getNowDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}
}
class LabelChange extends TimerTask {
	private JLabel jl;
	private 钟表 t;
	public LabelChange(JLabel jl, 钟表 t) {
		this.jl = jl;
		this.t = t;
	}
	@Override
	public void run() {
		jl.setText(t.getNowDate());
	}

}
