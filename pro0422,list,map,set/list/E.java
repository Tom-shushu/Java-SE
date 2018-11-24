package pro0422.list;

import java.util.Set;
import java.util.TreeSet;

public class E implements Comparable<E>{

	private Integer id;
	private Integer age;
	
	public E(int id) {
		this.id = id;
		this.age = (int)(Math.random()*40);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "E [id=" + id + ", age=" + age + "]";
	}
	
	
	public static void main(String[] args) {
		Set<E> set = new TreeSet<E>();
		
		E e1 = new E(1);
		set.add(e1);
		System.out.println("-------------------------------------");
		for (E e : set) {
			System.out.println(e);
		}
		
		E e2 = new E(2);
		set.add(e2);
		System.out.println("-------------------------------------");
		for (E e : set) {
			System.out.println(e);
		}
	}

	@Override
	public int compareTo(E o) {
		System.out.println("自身:"+this.getId()+",传递的id:"+o.getId());
		return this.getId()-o.getId();
	}
}
