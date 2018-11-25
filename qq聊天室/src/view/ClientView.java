package view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import thread.Receive;
import thread.Send;
import view.ServerView.ButtonSend;

public class ClientView extends JFrame {
	private JTextArea main;
	private JTextField send;
	private JButton button;
	private JPanel panel;
	
	private Socket s;

	public ClientView() {
		setTitle("客户端界面");

		main = new JTextArea();
		send = new JTextField(24);
		button = new JButton("发送");
		panel = new JPanel();

		panel.add(send);
		panel.add(button);

		add(main, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);


		button.addActionListener(new ButtonSend());
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 420, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		
		try {
			s = new Socket("localhost", 8888);
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			new Receive(s.getInputStream(), main).start();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	class ButtonSend implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				main.append("客户端:"+send.getText()+"\n");
				new Send(s.getOutputStream(),"客户端:",send.getText()).start();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ClientView();
	}
}
