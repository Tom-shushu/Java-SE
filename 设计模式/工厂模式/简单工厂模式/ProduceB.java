package 工厂模式.简单工厂模式;

// 产品的一个实现类
public class ProduceB implements Produce{

	@Override
	public void introduce() {
		System.out.println("我是产品B");
	}

}