package pro0415;

import java.io.File;
import java.io.IOException;

//文件类
public class J {

	//如何创建一个文件或者文件夹（目录）
	public void a() throws IOException{
		File file1 = new File("e://a");
		File file3 = new File("e://b//m");
		File file2 = new File("e://a.txt");
		
		//如何在电脑上的制定位置创建文件或者文件夹
		file1.mkdir();
		//file2.createNewFile();
		
		//删除文件夹或者文件
		//file1.delete();
		//file2.delete();
	}
	
	public void b(){
		File file1 = new File("e://b");
		File file2 = new File("E:\\新建文件夹\\我的C程序\\123.cpp");
		boolean b1 = file1.exists();
		boolean b2 = file2.exists();
		System.out.println(b1);
		System.out.println(b2);
		
		String fp1 = file1.getAbsolutePath();
		String fp2 = file2.getAbsolutePath();
		System.out.println(fp1+"\t"+fp2);
		
		String name1 = file1.getName();
		String name2 = file2.getName();
		System.out.println(name1+"\t"+name2);
		
		String pn1 = file1.getParent();
		String pn2 = file2.getParent();
		System.out.println(pn1+"\t"+pn2);
		
		boolean b11 = file1.isDirectory();
		boolean b12 = file1.isFile();
		System.out.println(b11+"\t"+b12);
		
	}
	
	public void c(){
		File e = new File("E://");
		
		File[] list = e.listFiles();
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}
		
	}
	//通过递归实现E盘下的目录遍历
	public void d(File file,int k){
		File[] childFile = file.listFiles();
		for (int i = 0; i < childFile.length; i++) {
			File f = childFile[i];
			for (int j = 0; j < k; j++) {
				System.out.print("\t");
			}
			System.out.println(f.getName());
			if(f.isDirectory()){
				d(f,(k+1));
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new J().d(new File("E://"),0);
	}
}
