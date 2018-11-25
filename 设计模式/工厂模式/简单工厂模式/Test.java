package 工厂模式.简单工厂模式;

public class Test {

	public static void main(String[] args) {
		Produce prod = SimpleFactory.getInstance(ProduceB.class);
		prod.introduce();
	}

}
