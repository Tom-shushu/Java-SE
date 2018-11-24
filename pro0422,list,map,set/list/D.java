package pro0422.list;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//TreeSet
public class D {

	public void a(){
		Set<String> set = new TreeSet<String>();
		set.add("陕西");
		set.add("山西");
		set.add("山东");
		set.add("陕西");
		set.add("湖南");
		
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void b(){
		Set<Integer> set = new TreeSet<Integer>();
		set.add((int)(Math.random()*100));
		set.add((int)(Math.random()*100));
		set.add((int)(Math.random()*100));
		set.add((int)(Math.random()*100));
		set.add((int)(Math.random()*100));
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	public void c(){
		Set<Person> set = new TreeSet<Person>();
		for (int i = 0; i < 10; i++) {
			Person p = new Person(i);
			set.add(p);
		}
		
		for (Person p : set) {
			System.out.println(p);
		}
		
	}
	
	public void d1(){
		Set<String> set = new TreeSet<String>();
		set.add("陕西");
		set.add("山西");
		set.add("山东");
		set.add("陕西");
		set.add("湖南");
		
		boolean b = set.contains("陕西");
		System.out.println(b);
	}
	public void d2(){
		Set<Person> set = new TreeSet<Person>();
		for (int i = 0; i < 10; i++) {
			Person p = new Person(i);
			set.add(p);
		}
		
		System.out.println("*********************************************");
		Person p1 = new Person(1);
		
		boolean b = set.contains(p1);

		System.out.println("*********************************************");
		System.out.println(b);
	}
	
	public void d3(){
		Set<Person> set = new TreeSet<Person>();
		
		Person p1 = new Person(0);
		
		set.add(p1);
		
		//System.out.println("现在集合的长度为:"+set.size());
		for (Person p : set) {
			System.out.println(p);
		}
		System.out.println("--------------------------");
		Person p2 = new Person(1);
		set.add(p2);
		//System.out.println("现在集合的长度为:"+set.size());
		
		
		for (Person p : set) {
			System.out.println(p);
		}

		System.out.println("--------------------------");
		Person p3 = new Person(2);
		set.add(p3);
		
		for (Person p : set) {
			System.out.println(p);
		}
	}
	
	
	
	public static void main(String[] args) {
		new D().d2();
	}

}
