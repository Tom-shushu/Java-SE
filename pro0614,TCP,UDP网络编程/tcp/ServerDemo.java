package pro0614.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Socket:TCP编程
public class ServerDemo {
	private Scanner pan = new Scanner(System.in);
	public void a(){
		try {
			//创建一个Socket节点,服务端:ServerSocket创建
			ServerSocket ss = new ServerSocket(8888);
			Socket s = ss.accept();//这个是一个服务端节点
			
			//负责产生一个输出流
			OutputStream out = s.getOutputStream();
			
			byte[] b = "Hello,Client!".getBytes();
			
			out.write(b);
			out.flush();
			
		} catch (IOException e) {
			System.out.println("链接出错!");
		}
	}
	
	public void b(){
		try {
			ServerSocket ss = new ServerSocket(7777);
			Socket s = ss.accept();
			OutputStream out = s.getOutputStream();
			
			String str ;
			
			while(true){
				System.out.println("请说:");
				str = pan.next();
				out.write(("服务端:"+str).getBytes());
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		new ServerDemo().b();
	}
	
}
