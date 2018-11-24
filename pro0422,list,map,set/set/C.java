package A0428;

import java.util.LinkedList;

public class C {
	
	public void X() {
		LinkedList<Integer>list1 = new LinkedList<Integer>();
		LinkedList<Integer>list2 = new LinkedList<Integer>(list1);
	}
	public void Y() {	
		LinkedList<Integer>list = new LinkedList<Integer>();
		//加入元素
		list.add(1);
		list.add(1, 2);
		list.addFirst(3);
		list.addLast(4);
		//查询
		int i = list.get(3);
		int j = list.getFirst();
		int k = list.getLast();
		System.out.println(i);
		//删除
		list.removeLast();
		list.remove(1);
		list.removeFirst();
		list.remove(new Integer(3));
		list.clear();
		//修改
		list.set(1, 5);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C s = new C();
s.X();
s.Y();
	}

}
