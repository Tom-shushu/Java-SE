package pro0506;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//负责去说带处理流的读取操作
//演示的为字符读取
public class DemoA {

	public void a(){
		try {
			//第一步:要有两个节点
			File file = new File("F://a.txt");
			//第二步:建立Java同file节点之间的链接通道,是一条单行线,只能从file到Java
			Reader reader = new FileReader(file);
			//第三步:构建缓冲处理流,负责将内容运输到指定地点
			BufferedReader br = new BufferedReader(reader);
			//第四步:卸货操作,送到客户的手上了
			String str = br.readLine();
			//第五步:关闭流通道
			br.close();
			reader.close();
			
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void b(){
		Reader reader = null;
		BufferedReader br = null;
		try {
			File file = new File("F://a.txt");
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			String str ;
			do {
				str = br.readLine();
				System.out.println(str==null?"":str);
			} while (str!=null);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br!=null){
					br.close();
				}
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void main(String[] args) {
		new DemoA().b();
		
	}
	
}
