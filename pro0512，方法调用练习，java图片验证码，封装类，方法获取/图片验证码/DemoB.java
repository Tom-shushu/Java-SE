﻿package pro0512;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DemoB {

	
	public static void main(String[] args) {
		try {
			File file = new File("F://b.jpg");
			
			int width = 220;
			int height = 120;
			int imageType = BufferedImage.TYPE_INT_RGB;
			
			BufferedImage image = new BufferedImage(width, height, imageType);
			
			Graphics g = image.getGraphics();
			Color c1 = new Color(255,255,255);
			g.setColor(c1);
			g.fillRect(0, 0, width, height);
			
			String str = "";
			for (int i = 0; i < 4; i++) {
				char ch = (char)((int)(Math.random()*26+65));
				str+=ch;
			}
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			Color c2 = new Color(red, green, blue);
			g.setColor(c2);
			
			Font font = new Font("", Font.BOLD, 36);
			
			g.setFont(font);
			g.drawString(str, 80, 60);
			
			//加入干扰点
			for (int i = 0; i < 155; i++) {
				int red1 = (int)(Math.random()*256);
				int green1 = (int)(Math.random()*256);
				int blue1 = (int)(Math.random()*256);
				
				Color color3 = new Color(red1, green1, blue1);
				g.setColor(color3);
				int x1 = (int)(Math.random()*width);
				int y1 = (int)(Math.random()*height);
				int x2 = (int)(Math.random()*width);
				int y2 = (int)(Math.random()*height);
				g.drawLine(x1, y1, x2, y2);
				
				
			}
			
			
			ImageIO.write(image, "jpg", file);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
