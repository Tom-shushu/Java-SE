package pro0506;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DemoE {

	public static void main(String[] args) {
		String str = "wwwwwwww\r\n";
		byte[]b = str.getBytes();
		//正则表达式[]
		try {
			File file = new File("F://d.txt");
			OutputStream out = new FileOutputStream(file,true);
			
			BufferedOutputStream bos = new BufferedOutputStream(out);
			//b:写的内容,off:从几开始,len:写几个字节
			bos.write(b, 0, 10);
			bos.flush();
			bos.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
