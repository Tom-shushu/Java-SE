package pro0422.list;

import java.util.LinkedList;

public class B {

	public void a(){
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>(list1);
		
	}
	
	public void b(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//加入元素方法
		list.add(1);
		list.addFirst(3);
		list.add(1, 2);
		list.addLast(4);
		//获取元素方法
		int i = list.get(2);
		int j = list.getFirst();
		int k = list.getLast();
		//删除元素方法
		list.remove(1);
		list.removeFirst();
		list.removeLast();
		list.remove(new Integer(3));
		list.clear();
		//修改元素方法
		list.set(1, 7);
		System.out.println(i+"\t"+j+"\t"+k);
	}
	public static void main(String[] args) {
		new B().b();
	}

}
