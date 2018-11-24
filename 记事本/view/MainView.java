package com.excellent.text.view;

import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import com.excellent.text.listener.OpenFileListener;
import com.excellent.text.listener.SaveFileListener;
import com.excellent.text.listener.SetFontListener;

/*
 * ���������������,Ҳ�ǳ������ڽ���
 */
public class MainView extends JFrame{
	private static final long serialVersionUID = 1L;

	//�����ؼ�
	private TextArea textArea;//�����һ���ı���
	private MenuBar bar;//�˵���
	private Menu menu1,menu2,menu3,menu4,menu5;
	private MenuItem item11,item12,item13,item14,item17,item31,item32;
	public MainView() {
		this.setTitle("���±�");
		
		//���λ�ø���New�ؼ�
		textArea = new TextArea();
		
		bar = new MenuBar();
		menu1 = new Menu("�ļ�");
		menu2 = new Menu("�༭");
		menu3 = new Menu("�鿴");
		menu4 = new Menu("��ʽ");
		menu5 = new Menu("����");
		
		item11 = new MenuItem("�½�");
		item12 = new MenuItem("��");
		item13 = new MenuItem("����");
		item14 = new MenuItem("���Ϊ");
		item17 = new MenuItem("�˳�");
		item31 = new MenuItem("�Զ�����");
		item32 = new MenuItem("����");
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		bar.add(menu5);
		
		menu1.add(item11);
		menu1.add(item12);
		menu1.add(item13);
		menu1.add(item14);
		menu1.addSeparator();
		menu1.add(item17);
		menu3.add(item31);
		menu3.add(item32);
		
		//�޸Ĳ˵�����������ʾ
		Font font = new Font("����", Font.BOLD, 12);
		bar.setFont(font);
		
		//���˵����еĲ˵���ѡ������¼�
		item12.addActionListener(new OpenFileListener(this));
		item13.addActionListener(new SaveFileListener(this));
		item32.addActionListener(new SetFontListener(textArea,this));
		//��ӿ�ݼ�
		item12.setShortcut(new MenuShortcut(KeyEvent.VK_O));
		item13.setShortcut(new MenuShortcut(KeyEvent.VK_S));
		
		//���λ�ý��ؼ����뵽����
		this.add(textArea);
		this.setMenuBar(bar);//���˵������뵽������
		
		//���ô���Ĵ�С�;�����ʾ
		this.setBounds(0, 0, 600, 400);
		this.setLocationRelativeTo(null);
		//�رղ����ͷ��ڴ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ʾ,һ����������һ��
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainView();
	}
}
