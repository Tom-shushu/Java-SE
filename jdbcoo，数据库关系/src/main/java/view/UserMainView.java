package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import biz.UserBiz;
import test.Test;

@SuppressWarnings("serial")
public class UserMainView extends JFrame {

	private JScrollPane jsp;
	private JTable table;
	private JPanel panel, topPanel;
	private JButton first, last, prev, next;
	private JTextField wd;
	private JButton search;
	private UserBiz ub = new UserBiz();
	private int allSize;

	public UserMainView() {
		setTitle("用户信息");
		table = new JTable(ub.findUserByPage(Test.nowPage, 10), getColumnTitle());
		jsp = new JScrollPane(table);

		panel = new JPanel();
		first = new JButton("首页");
		last = new JButton("末页");
		prev = new JButton("上一页");
		next = new JButton("下一页");

		panel.add(first);
		panel.add(prev);
		panel.add(next);
		panel.add(last);

		wd = new JTextField(24);
		search = new JButton("搜索一下");
		topPanel = new JPanel();

		topPanel.add(wd);
		topPanel.add(search);

		first.addActionListener(new ChangePage(0));
		prev.addActionListener(new ChangePage(-1));
		next.addActionListener(new ChangePage(1));
		allSize = ub.findAllUser().length;
		last.addActionListener(new ChangePage(allSize % 10 == 0 ? (allSize / 10) : (allSize / 10 + 1)));

		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = wd.getText();
				Object[][] rows = ub.findUserByName(name);
				table = new JTable(rows, getColumnTitle());
				jsp.setViewportView(table);
			}
		});

		add(jsp);
		add(panel, BorderLayout.SOUTH);
		add(topPanel, BorderLayout.NORTH);

		first.setEnabled(false);
		prev.setEnabled(false);
		setBounds(0, 0, 700, 450);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	class ChangePage implements ActionListener {
		private int i;

		public ChangePage(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent e) {
			// 进入时,默认都是可以选中的
			first.setEnabled(true);
			prev.setEnabled(true);
			last.setEnabled(true);
			next.setEnabled(true);

			if (i == 0) {
				Test.nowPage = 1;
			} else if (i == -1) {
				Test.nowPage = Test.nowPage - 1;
			} else if (i == 1) {
				Test.nowPage = Test.nowPage + 1;
			} else {
				Test.nowPage = i;
			}
			if (Test.nowPage == 1) {
				first.setEnabled(false);
				prev.setEnabled(false);
			} else if (Test.nowPage == (allSize % 10 == 0 ? (allSize / 10) : (allSize / 10 + 1))) {
				last.setEnabled(false);
				next.setEnabled(false);
			}

			Object[][] rows = ub.findUserByPage(Test.nowPage, 10);
			table = new JTable(rows, getColumnTitle());
			jsp.setViewportView(table);// 刷新table
		}

	}

	public Object[] getColumnTitle() {
		Object[] titles = { "编号", "姓名", "性别", "年龄", "地址" };
		return titles;
	}

}
