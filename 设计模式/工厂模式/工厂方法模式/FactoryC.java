package 工厂模式.工厂方法模式;

public class FactoryC implements Factory {

	@Override
	public Produce getInstance() {
		// TODO Auto-generated method stub
		return new ProduceC();
	}
}
