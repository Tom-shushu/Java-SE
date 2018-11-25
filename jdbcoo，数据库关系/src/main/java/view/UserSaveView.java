package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import bean.UserInfo;
import biz.UserBiz;


@SuppressWarnings("serial")
public class UserSaveView extends JFrame{
	private JLabel jl1,jl2,jl3,jl4;
	private JTextField jtf1,jtf3,jtf4;
	private JRadioButton rb1,rb2;
	private ButtonGroup bg;
	private JButton button;
	
	private JLabel nameErr;
	
	private UserBiz ub = new UserBiz();
	
	public UserSaveView() {	
		setTitle("注册新用户");
		setLayout(null);
		
		nameErr = new JLabel("");
		rb1 = new JRadioButton("男", true);
		rb2 = new JRadioButton("女", false);
		
		button = new JButton("注册新用户");
		
		//将两个单选按钮加入到一个组里
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		jl1 = new JLabel("姓名:");
		jl2 = new JLabel("性别:");
		jl3 = new JLabel("年龄:");
		jl4 = new JLabel("城市:");
		
		jtf1 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();
		
		jl1.setBounds(50, 80, 60, 20);
		jl2.setBounds(50, 150, 60, 20);
		jl3.setBounds(50, 220, 60, 20);
		jl4.setBounds(50, 290, 60, 20);
		
		jtf1.setBounds(120, 80, 140, 20);
		rb1.setBounds(120, 150, 60, 20);
		rb2.setBounds(190, 150, 60, 20);
		jtf3.setBounds(120, 220, 140, 20);
		jtf4.setBounds(120, 290, 140, 20);
		
		button.setBounds(160, 400, 120, 30);
		
		nameErr.setBounds(300, 80, 140, 20);
		
		add(jl1);
		add(jl2);
		add(jl3);
		add(jl4);
		
		add(jtf1);
		add(jtf3);
		add(jtf4);
		
		add(rb1);
		add(rb2);
		
		add(button);
		
		add(nameErr);
		
		button.addActionListener(new Reg());
		
		jtf1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String name = jtf1.getText();
				
				//判断是否为空
				if("".equals(name)){
					nameErr.setText("姓名不能为空!");
					
				}else{
					boolean b = Pattern.matches("[\u4e00-\u9fa5]{2,4}", name);
					if(!b){
						nameErr.setText("姓名只能为2-4位汉字!");
					}else{
						nameErr.setText("名字可以使用!");
					}
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
			}
		});
		
		setBounds(0, 0, 450, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class Reg implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = jtf1.getText();
			String sex = rb1.isSelected()?"男":"女";
			int age = Integer.parseInt(jtf3.getText());
			String address = jtf4.getText();
			
			UserInfo ui = new UserInfo();
			ui.setUserAddress(address);
			ui.setUserAge(age);
			ui.setUserName(name);
			ui.setUserSex(sex);
			
			
			ub.saveUser(ui);
			setVisible(false);
		}
		
	}

}
