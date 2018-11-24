package pro0506;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class DemoC {

	//只读操作
	public void a() {
		// properties
		ResourceBundle resource = ResourceBundle.getBundle("pro");

		String value1 = resource.getString("height");
		System.out.println(value1);
	}

	// 通过流的方式
	public void b() {
		try {
			// 通过类加载器获取到pro.properties文件
			InputStream is = DemoC.class.getClassLoader()
					.getResourceAsStream("pro.properties");
			
			String path = DemoC.class.getClassLoader().getResource("pro.properties").getPath();
			BufferedReader br = new 
					BufferedReader(new InputStreamReader(is));
			//获取到配置文件对象
			Properties resource = new Properties();
			resource.load(br);//加载缓冲流
			
			String value1 = resource.getProperty("width");
			
			System.out.println(value1);
			//添加一个内容
			OutputStream out = new FileOutputStream(path);
			resource.put("name", "hhhhhh");
			resource.save(out, "");
			out.flush();
			out.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new DemoC().b();
	}
}
