package 工厂模式.抽象工厂模式;

public class Test {

	public static void main(String[] args) {
		Factory f = new FactoryA();
		颜色 color = f.getColor();
		内存 ram = f.getRam();
		System.out.println(color.color());
		System.out.println(ram.size());
	}
}
