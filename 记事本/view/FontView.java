package com.excellent.text.view;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class FontView extends JDialog{
	private static final long serialVersionUID = 1L;

	private TextArea textArea;
	
	private JLabel label1,label2,label3;
	private JTextField text1,text2,text3;
	private JList list1,list2,list3;
	private JButton button1,button2;
	public FontView(TextArea textArea,JFrame frame) {
		super(frame,"字体",true);
		this.setTitle("字体");
		this.textArea = textArea;
		
		
		//设置布局,自定义布局
		this.setLayout(null);
		
		label1 = new JLabel("字体");
		label2 = new JLabel("自行");
		label3 = new JLabel("大小");
		
		text1 = new JTextField();
		text2 = new JTextField();
		text3 = new JTextField();
		
		list1 = new JList(new String[]{"宋体","Algerian","楷体","幼圆"});
		list2 = new JList(new String[]{"常规","倾斜","粗体"});
		list3 = new JList(new String[]{"4","8","12","16","20","24","28","32","36","40"});
		
		button1 = new JButton("确定");
		button2 = new JButton("取消");
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(list1);
		this.add(list2);
		this.add(list3);
		this.add(button1);
		this.add(button2);
		
		label1.setBounds(20, 30, 60, 20);
		label2.setBounds(180, 30, 60, 20);
		label3.setBounds(340, 30, 60, 20);
		
		text1.setBounds(20, 50, 120, 20);
		text2.setBounds(180, 50, 90, 20);
		text3.setBounds(340, 50, 60, 20);
		
		list1.setBounds(20, 80, 120, 200);
		list2.setBounds(180, 80, 90, 200);
		list3.setBounds(340, 80, 60, 200);

		button1.setBounds(210, 300, 60, 30);
		button2.setBounds(280, 300, 60, 30);
		
		Font oldFont = this.textArea.getFont();
		String name = oldFont.getName();
		int style = oldFont.getStyle();
		int size = oldFont.getSize();
		System.out.println(name+"\t"+style+"\t"+size);
		
		text1.setText(name);
		String style1 = "";
		if(style == Font.PLAIN){
			style1 = "常规";
		}else if(style == Font.ITALIC){
			style1 = "倾斜";
		}else{
			style1 = "粗体";
		}
		
		text2.setText(style1);
		text3.setText(size+"");
		
		
		button1.addActionListener(new OK());
		
		this.setBounds(0, 0, 450, 500);
		this.setVisible(true);
	}
	
	//确定按钮的事件类 
	class OK implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = list1.getSelectedValue().toString();
			String style1 = list2.getSelectedValue().toString();
			int style = 0;
			
			if(style1.equals("常规")){
				style = Font.PLAIN;
			}else if(style1.equals("倾斜")){
				style = Font.ITALIC;
			}else{
				style = Font.BOLD;
			}
			
			int size = Integer.parseInt(list3.getSelectedValue().toString());
			Font font = new Font(name, style, size);
			textArea.setFont(font);
			setVisible(false);
			//System.out.println(str1+"\t"+str2+"\t"+str3);
		}
		
	}

}
