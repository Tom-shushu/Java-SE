package pro0614.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public void a(){
		try {
			//创建客户端套接字(Socket)
			Socket s = new Socket("localhost", 8888);
			
			//产生一个输入流
			InputStream in = s.getInputStream();
			byte[]b = new byte[1024];
			in.read(b);
			
			String str = new String(b);
			System.out.println(str);
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void b(){
		try {
			Socket s = new Socket("127.0.0.1", 7777);
			InputStream in = s.getInputStream();
			
			while(true){
				byte[]b = new byte[100];
				in.read(b);
				String str = new String(b);
				System.out.println(str);
			}
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public static void main(String[] args) {
		new ClientDemo().b();
	}
	
}
