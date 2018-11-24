package com.excellent.text.listener;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class OpenFileListener implements ActionListener{

	private JFrame frame;
	public OpenFileListener(JFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//���ļ�ѡ����show����
		FileDialog fileDialog = new FileDialog(frame, "��", FileDialog.LOAD);
		fileDialog.setVisible(true);
	}

}
