package com.excellent.text.listener;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class SaveFileListener implements ActionListener{

	private JFrame frame;
	public SaveFileListener(JFrame frame){
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog fileDialog = new FileDialog(frame, "±£´æ", FileDialog.SAVE);
		fileDialog.setVisible(true);
	}

}
