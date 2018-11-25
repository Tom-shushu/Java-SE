package 工厂模式.简单工厂模式;

// 简单工厂
public class SimpleFactory {

	@SuppressWarnings("unchecked")
	public static <T> T getInstance(Class<T> c) {
		T t = null;
		if (c == ProduceA.class) {
			t = (T) new ProduceA();
		} else if (c == ProduceB.class) {
			t = (T) new ProduceB();
		} else if (c == ProduceC.class) {
			t = (T) new ProduceC();
		}

		return t;
	}
}
