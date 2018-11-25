package 工厂模式.工厂方法模式;

public class FactoryA implements Factory{

	@Override
	public Produce getInstance() {
		return new ProduceA();
	}

}
