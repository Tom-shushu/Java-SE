package 代理模式.静态代理模式;

public class 顾客 implements BuyHouse{

	@Override
	public void buyHouse() {
		System.out.println("我要买房子");
	}

}
