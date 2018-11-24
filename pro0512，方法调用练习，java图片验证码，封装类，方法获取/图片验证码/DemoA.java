package pro0512;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;


//生成一张图片
public class DemoA {

	public static void main(String[] args) {
		try {
			File file = new File("F://2.jpg");//这个就是图片文件
			OutputStream os = new FileOutputStream(file);
			//图片流
			int width = 400;
			int height = 320;
			int imageType = BufferedImage.TYPE_INT_RGB;
			//图片
			BufferedImage image = new BufferedImage(width, height, imageType);
			//动笔
			Graphics g = image.getGraphics();
			Color color1 = new Color(10,255,16);
			g.setColor(color1);
			g.fillRect(0, 0, width, height);
			
			//画一条线
			Color color2 = new Color(0, 0, 255);
			g.setColor(color2);
			g.drawLine(0, 0, 400, 320);
			//写入内容
			Color color3 = new Color(255, 0, 0);
			g.setColor(color3);
			g.drawString("ABCD", 30, 50);
			//生成图片
			ImageIO.write(image, "jpg", os);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
