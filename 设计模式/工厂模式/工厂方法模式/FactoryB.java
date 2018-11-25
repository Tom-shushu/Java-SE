package 工厂模式.工厂方法模式;

public class FactoryB implements Factory {

	@Override
	public Produce getInstance() {
		return new ProduceB();
	}

}
