package pro0506;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//字节输入流
public class DemoD {

	public static void main(String[] args) {
		try {
			//文件
			File file = new File("F://d.txt");
			InputStream in = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(in);
			byte[] b = new byte[4];//数组长度为4
			//size:实际的大小,b:声明大小
			int size = bis.read(b);
			System.out.println("实际大小:"+size+"\t声明大小:"+b.length);
			//按照byte数组生产一个字符串
			String str = new String(b);
			System.out.println(str.trim());
			bis.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
