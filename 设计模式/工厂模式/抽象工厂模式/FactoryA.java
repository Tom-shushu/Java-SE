package 工厂模式.抽象工厂模式;

public class FactoryA implements Factory{

	@Override
	public 颜色 getColor() {
		// TODO Auto-generated method stub
		return new 白色();
	}

	@Override
	public 内存 getRam() {
		// TODO Auto-generated method stub
		return new 大内存();
	}

}
