package A0428;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {
	public void b() {
		List<Student>list = new ArrayList<Student>();
		for(int i=0;i<10;i++) {
			Student s = new Student(i);
			list.add(s);
		
		
		}
		
		int len = list.size();
		System.out.println("³¤¶ÈÎª"+len);
		for(int i=0;i<len;i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
		
		
	}
	
	public static void main(String[] args) {
		new B().b();
	}
}
