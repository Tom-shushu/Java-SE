package A0428;

import java.util.Set;
import java.util.TreeSet;

import pro0401.Person;



public class E {
	public void a() {
		Set <String>Set = new TreeSet<String>();
		Set.add("����");
		Set.add("����");
		Set.add("����");
		Set.add("����");
		Set.add("ɽ��");
	System.out.println("");	
	}
	
	
	
	public void b() {
		Set <Person>set = new TreeSet<Person>();
		for(int i=0;i<10;i++) {
			Person p = new Person();
			set.add(p);
		}
		boolean b = set.contains(new Person());
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new E().b();
	}

}
