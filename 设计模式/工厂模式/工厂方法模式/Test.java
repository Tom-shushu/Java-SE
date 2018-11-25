package 工厂模式.工厂方法模式;

public class Test {

	public static void main(String[] args) {
		Factory f = new FactoryA();
		Produce p1 = f.getInstance();
		p1.introduce();
	}
}
