package pro0421.扩展;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//界面
public class A extends JFrame{
	
	private JButton button ;//声明了一个按钮
	public A() {
		//设置标题
		this.setTitle("标题");
		//处理控件
		button = new JButton("确定");
		this.add(button);//将按钮加入到界面中
		//当点击按钮时,执行函数(动作)
		button.addActionListener(new ActionA(this));
		
		
		//设置关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置尺寸
		this.setBounds(500, 300, 400, 220);
		//显示界面
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new A();
	}
	//1.通过内部类去完成,将一个类写到另一个类的类体中,这个类就叫做内部类,另一个叫做外部类
	//2.需要将这个类变成事件处理类
	class ActionA implements ActionListener{
		//声明了一个属性
		JFrame frame;
		//通过构造器对这个属性传值
		public ActionA(JFrame frame) {
			this.frame = frame;
		}
		
		public void actionPerformed(ActionEvent e) {
			frame.setTitle("修改了!!!");
			
			System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeee");
		}
	}
	
	
}
//1.内部类
//2.事件委托机制

//事件: 事件 函数(动作)
//当一件事情发生的时候触发的函数(动作)--->事件处理
