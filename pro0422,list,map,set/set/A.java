package A0428;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class A<E> {

	//如何产生一个ArrayList集合
	public void a() {
		//泛型：泛泛的类型，就是规定
	 List<String>list1 = new ArrayList <String>();
	 List <String>list2 = new ArrayList<String>();
	 }
	
	
	
	
	public void b() {
		 List<String>list1 = new ArrayList <String>();
		list1.add("陕西");
		list1.add("广东");
		list1.add("河北");
		list1.add(1," 上海");
		
		int len = list1.size();
		System.out.println("长度为" +len);
		
		String e = list1.get(2);
		System.out.println(e);
		
		
		/* 第一中  String str1 = list1.get(0);
		String str2 = list1.get(1);
		String str3 = list1.get(2);
		String str4 = list1.get(3);
		System.out.println( str1+"\t"+str2+"\t"+str3+"\t"+str4);
		*/
		
		//第二种普通遍历
		for(int i=0;i<len;i++) {
			String str = list1.get(i);
			System.out.println(str);
		}
		}
	
	
	
	
	public void c() {
		
		
		
		
		//游标模式截带（迭代器模式）
		List<Student>list = new ArrayList<Student>();
		for(int i=0;i<10;i++) {
			Student s = new Student(i);
			list.add(s);
		}
		
		//游标模式遍历
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
		Student s = it.next();
		System.out.println(s);
	}
	
	//缩写的游标写法
		for(Student s:list) {
		System.out.println(s);
	}
	
		boolean b = list.isEmpty();
		System.out.println(b);
	
		list.set(2, null);
		System.out.println(list.size());
	
	
		list.remove(3);
		System.out.println(list.size());
	
		list.clear();
		System.out.println(list.size());
		
		
		Object [] arr = list.toArray();
		for(Object o:arr) {
			System.out.println(o);
		}
		
		
	
	}
	
	
	//拆箱装箱
	public void f() {
		List<Student>list = new ArrayList<Student>();
		for(int i=0;i<10;i++) {
			Student s = new Student(i);
			list.add(s);
		}
		
		for(Student s :list) {
			if(s.getStuSex().equals("女")) {
			s.setStuName("张三");
			}
		}
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
		Student s = it.next();
		System.out.println(s);
	}
	}
	//LinkedList
	
	

	
	
	public static void main(String[] args) {
		A s = new A();
		s.a();
		s.b();
		s.c();
		s.f();
		
	}

}
