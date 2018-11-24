package A0428;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D {
public  void a01() {
	List<Integer> list = new ArrayList<Integer>();
	for(int i =0;i<10;i++) {
		int a = (int)(Math.random()*100+1);
		list.add(a);
	}
	for(Integer i :list) {
		System.out.print(i+"\t");
	}

	System.out.print("\n");
	//排序
	Collections.sort(list);
	for(Integer i :list) {
		System.out.print(i+"\t");
	}
	
}

@SuppressWarnings("unchecked")
public void a02() {
	List<Student> list = new ArrayList<Student>();
	
	
	for(int i=0;i<10;i++) {
		Student s = new Student(i);
		list.add(s);
	}
	
	System.out.println("原始内容");
for(Student s:list) {
	System.out.println(s);
}	
Collections.sort(list);
System.out.println("排序后的内容");
for(Student s:list) {
	System.out.println(s);
	
}
}

public void c() {
	 List<String>list1 = new ArrayList <String>();
		list1.add("陕西");
		list1.add("广东");
		list1.add("河北");
		list1.add(1," 上海");
		String str = "广东";
		String str1 = new String("广东");
		boolean b = list1.contains(str);
		boolean c = list1.contains(str1);
		int index = list1.indexOf(str);
				System.out.println(b);
		System.out.println(c);
}


public void d() {
	
}



public static void main(String[] args) {
	D s = new D();
s.c();
	s.b();
}
}



