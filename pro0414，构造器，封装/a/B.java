package pro0414.a;

public class B extends A {
	public int a = 2;
	public int b = 2;

	public B(int a, int b, int c) {
		super(a, b, c);
		this.a = a;
		this.b = b;
		this.c = a + b;
	}
}