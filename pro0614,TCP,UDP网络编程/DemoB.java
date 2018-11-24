package pro0614;

import java.io.*;
import java.net.*;

public class DemoB {

	public static void main(String[] args) {
		try {
			//获取到路径
			URL url = new URL("http://www.baidu.com/s?wd=java");
			//打开路径,并将路径的链接获取到
			URLConnection urlConnection = url.openConnection();
			
			//向下转型成HTTP的URLConnection
			HttpURLConnection connection = (HttpURLConnection) urlConnection;
			//负责产生一个字节的读取流
			InputStreamReader reader = new InputStreamReader(connection.getInputStream());
			BufferedReader in = new BufferedReader(reader);
			String urlString = "";
			String current;
			//进行读取
			while ((current = in.readLine()) != null) {
				urlString += current + "\n";
			}
			System.out.println(urlString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
