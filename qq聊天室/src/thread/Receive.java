package thread;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.JTextArea;

public class Receive extends Thread {

	private InputStream in;
	private JTextArea jta;

	public Receive(InputStream in, JTextArea jta) {
		this.in = in;
		this.jta = jta;
	}

	@Override
	public void run() {
		while(true){
			try {
				byte[] b = new byte[1024];
				in.read(b);
				String str = new String(b);
				jta.append(str + "\n");// 将接收的内容显示到文本域中
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
