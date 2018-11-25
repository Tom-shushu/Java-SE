package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import thread.Receive;
import thread.Send;

public class ServerView extends JFrame{

	private JTextArea main;
	private JTextField send;
	private JButton button;
	private JPanel panel;
	
	//����ͨ������
	private ServerSocket ss;
	private Socket s;
	
	public ServerView() {
		setTitle("����˽���");

		main = new JTextArea();
		send = new JTextField(24);
		button = new JButton("����");
		panel = new JPanel();
		
		panel.add(send);
		panel.add(button);
		
		add(main,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		button.addActionListener(new ButtonSend());
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 420, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		
		try {
			ss = new ServerSocket(8888);
			s = ss.accept();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//�������н���
		try {
			Receive r = new Receive(s.getInputStream(),main);
			r.setDaemon(true);
			r.start();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	class ButtonSend implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			main.append("�����:"+send.getText()+"\n");
		 
		new Send(s.getOutputStream(),"�����:",send.getText()).start();
		 
		}
		
	}
	public static void main(String[] args) {
		new ServerView();
	}
}
