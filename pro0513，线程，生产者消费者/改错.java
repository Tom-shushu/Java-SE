package pro0513;
//实现共享操作
public class 改错 {


	public static int j = 1;
	
	public static void main(String[] args) {
		int i = 1;
		
		E e1 = new E(i, "A");
		E e2 = new E(i, "B");
		
		e1.start();
		e2.start();
		
	}
	
}

class E extends Thread{
	private int i ;
	private String name;
	public E(int i,String name) {
		this.i = i;
		this.name = name;
	}
	public void run() {
		for (int m = 1; m < 11; m++) {
			i++;
			System.out.println(name+":"+m+":"+i);
		}
	}
}
