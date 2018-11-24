package pro0422.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C {

	public void a() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 100 + 1);
			list.add(a);
		}
		for (Integer i : list) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		// 类似于数组中Arrays,Collections
		Collections.sort(list);
		for (Integer i : list) {
			System.out.print(i + "\t");
		}
	}

	public void b() {
		// 产生了一个存放Student类型的集合
		List<Student> list = new ArrayList<Student>();
		// 想list集合内通过循环方式添加了10个学生
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i);
			list.add(s);
		}

		System.out.println("原始的内容:");
		for (Student s : list) {
			System.out.println(s);
		}
		// 当我们进行对集合内容排序时,泛型元素必须实现Comparable接口,重写compareTo方法,自定义规则
		Collections.sort(list);
		System.out.println("排序后的内容:");
		for (Student s : list) {
			System.out.println(s);
		}
	}

	public void c() {
		List<String> list = new ArrayList<String>();
		list.add("陕西");
		list.add("山西");
		list.add("湖北");
		list.add("湖南");

		String str = new String("湖北");

		boolean b = list.contains(str);

		int index = list.indexOf(str);// 如果不存在-1

		System.out.println(b + "\t" + index);
	}

	public void d() {
		// 产生了一个存放Student类型的集合
		List<Student> list = new ArrayList<Student>();
		// 想list集合内通过循环方式添加了10个学生
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i);
			list.add(s);
		}
		
		Student s = new Student(1);
		boolean b = list.contains(s);
		int index = list.indexOf(s);
		System.out.println(b + "\t" + index);
	}

	public static void main(String[] args) {
		new C().d();
	}

}
