package pro0506;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

//文件写操作,字符流
public class DemoB {

	
	public void a(){
		try {
			//第一步:创建被写入的对象
			File file = new File("F://b.txt");
			//如果不存在,就创建这个文件
			boolean b = file.exists();
			if(!b){
				file.createNewFile();
			}
			//第二步:创建写入流节点对象
			Writer out = new FileWriter(file);
			//第三步:创建缓冲流来提升写入操作
			BufferedWriter bw = new BufferedWriter(out);
			bw.write("Hello,Java!");//写入
			//第四步:关闭
			bw.flush();//刷新
			bw.close();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	private Scanner s = new Scanner(System.in);
	public void b(){
		try {
			File file = new File("F://b.txt");
			//第二个参数为操作模式,true:追加,false:覆盖(默认情况)
			Writer out = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(out);
			System.out.print("请输入:");
			String str = s.nextLine();
			while(!"exit".equals(str)){
				bw.write(str+"\r\n");
				System.out.print("请输入:");
				str = s.nextLine();
				bw.flush();
			}
			bw.close();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//将内容写入到exl中去
	public void c(){
		try {
			File file = new File("F://a.xls");
			Writer out = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(out);
			String str = "编号\t姓名\t年龄\n";
			bw.write(str);
			bw.flush();
			for (int i = 1; i < 11; i++) {
				str = i+"\t"+(char)((int)(Math.random()*26+97))+"\t"+(int)(Math.random()*26+15)+"\n";
				bw.write(str);
				bw.flush();
			}
			bw.close();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	//这个代码演示的为仅仅通过节点流输出内容到文件
	public void d(){
		try {
			File file = new File("F://c.txt");
			Writer out = new FileWriter(file);
			out.write("aaaa");
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public static void main(String[] args) {
		new DemoB().d();
	}
}
