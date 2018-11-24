package pro0414.a;

public class A {

	private int a;
	public int b;
	public int c;

	public A() {
		a = 1;
		b = 1;
		c = 1;
	}

	public A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
