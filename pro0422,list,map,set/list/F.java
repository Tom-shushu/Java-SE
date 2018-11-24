package pro0422.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//HashSet
public class F {

	public void a() {
		// 创建一个空集合
		Set<Integer> set1 = new HashSet<Integer>();
		// 创建一个集合,内容为指定的set
		Set<Integer> set2 = new HashSet<Integer>(set1);

	}

	public void b() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(1);
		Set<Integer> set = new HashSet<Integer>();
		// 添加内容
		set.add(7);
		set.add(5);
		set.addAll(list);// 复制,批量添加

		for (Integer i : set) {
			System.out.println(i);
		}
	}

	public void c() {
		Set<Integer> set = new HashSet<Integer>();
		// 添加内容
		set.add(7);
		set.add(5);
		set.add(6);
		set.add(8);
		set.add(4);

		// 将set集合转换成数组,注意:数组只能为Object类型的
		Object[] arr = set.toArray();
		// 将Set集合转换成list集合
		List<Integer> list = new ArrayList<Integer>(set);
		for (Integer i : list) {
			System.out.print(i + "\t");
		}

	}

	public void d() {
		Set<ClassInfo> set = new HashSet<ClassInfo>();
		ClassInfo ci1 = new ClassInfo(1, "软件1班", 23);
		ClassInfo ci2 = new ClassInfo(2, "软件2班", 25);
		ClassInfo ci3 = new ClassInfo(3, "软件3班", 31);
		ClassInfo ci4 = new ClassInfo(4, "软件4班", 18);
		ClassInfo ci5 = ci2;
		ClassInfo ci6 = new ClassInfo(3, "软件3班", 31);
		// set不重复,地址不能重复,新问题:要求编号如果重复,也不行(不能添加到set集合中)
		set.add(ci1);
		set.add(ci2);
		set.add(ci3);
		set.add(ci4);
		set.add(ci5);
		set.add(ci6);
		set.add(ci3);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		Iterator<ClassInfo> it = set.iterator();
		while (it.hasNext()) {
			ClassInfo ci = it.next();
			System.out.println(ci);
		}
		System.out.println("---------------------------------------------------");
		// 原则:班级人数的大小进行升序操作
		Set<ClassInfo> set1 = new TreeSet<ClassInfo>(set);
		for (ClassInfo ci : set1) {
			System.out.println(ci);
		}
		List<ClassInfo> list = new ArrayList<ClassInfo>(set);
		Collections.sort(list);
		for (ClassInfo ci : list) {
			System.out.println(ci);
		}
	}

	public static void main(String[] args) {
		new F().d();
	}

}
