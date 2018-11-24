package com.excellent.text.listener;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.excellent.text.view.FontView;

public class SetFontListener implements ActionListener {

	private TextArea textArea;
	private JFrame frame;

	public SetFontListener(TextArea textArea,JFrame frame) {
		this.textArea = textArea;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new FontView(textArea, frame);
	}

}
