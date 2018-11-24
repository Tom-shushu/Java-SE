package pro0415;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64.Encoder;

public class H {

	//转码：将汉字转化成一段字母表达式
	public void a(String str) throws UnsupportedEncodingException{
		System.out.println(str);
		String a = URLEncoder.encode(str, "gbk");//gbk  iso-8859-1
		System.out.println(a);
		b(a);
	}
	//解码：就是讲一段字母表达式转换成汉字
	public void b(String str) throws UnsupportedEncodingException{
		System.out.println(str);
		String a = URLDecoder.decode(str, "gbk");
		System.out.println(a);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "你好呀";
		H h = new H();
		h.a(str);
	}
}
