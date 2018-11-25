package 代理模式.静态代理模式;

// 代理类
public class 中介 implements BuyHouse{

	private BuyHouse bh;
	public 中介(BuyHouse bh) {
		super();
		this.bh = bh;
	}
	public void buyHouse() {
		// 调用顾客的购买方法
		bh.buyHouse();
	}
}