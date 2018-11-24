package pro0614;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoA {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://www.baidu.com/s?wd=java");
			System.out.println("路径:"+url.getPath());
			System.out.println("协议:"+url.getProtocol());
			System.out.println("主机:"+url.getHost());
			System.out.println("端口:"+url.getPort());
			System.out.println("文件:"+url.getFile());
			System.out.println("参数:"+url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
