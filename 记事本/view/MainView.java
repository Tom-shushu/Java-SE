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
 * 这个界面是主界面,也是程序的入口界面
 */
public class MainView extends JFrame{
	private static final long serialVersionUID = 1L;

	//声明控件
	private TextArea textArea;//这个是一个文本域
	private MenuBar bar;//菜单栏
	private Menu menu1,menu2,menu3,menu4,menu5;
	private MenuItem item11,item12,item13,item14,item17,item31,item32;
	public MainView() {
		this.setTitle("记事本");
		
		//这个位置负责New控件
		textArea = new TextArea();
		
		bar = new MenuBar();
		menu1 = new Menu("文件");
		menu2 = new Menu("编辑");
		menu3 = new Menu("查看");
		menu4 = new Menu("格式");
		menu5 = new Menu("帮助");
		
		item11 = new MenuItem("新建");
		item12 = new MenuItem("打开");
		item13 = new MenuItem("保存");
		item14 = new MenuItem("另存为");
		item17 = new MenuItem("退出");
		item31 = new MenuItem("自动换行");
		item32 = new MenuItem("字体");
		
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
		
		//修改菜单栏的字体显示
		Font font = new Font("宋体", Font.BOLD, 12);
		bar.setFont(font);
		
		//给菜单栏中的菜单子选项添加事件
		item12.addActionListener(new OpenFileListener(this));
		item13.addActionListener(new SaveFileListener(this));
		item32.addActionListener(new SetFontListener(textArea,this));
		//添加快捷键
		item12.setShortcut(new MenuShortcut(KeyEvent.VK_O));
		item13.setShortcut(new MenuShortcut(KeyEvent.VK_S));
		
		//这个位置将控件加入到窗体
		this.add(textArea);
		this.setMenuBar(bar);//将菜单栏加入到窗体中
		
		//设置窗体的大小和居中显示
		this.setBounds(0, 0, 600, 400);
		this.setLocationRelativeTo(null);
		//关闭并且释放内存
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示,一般必须在最后一行
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainView();
	}
}
