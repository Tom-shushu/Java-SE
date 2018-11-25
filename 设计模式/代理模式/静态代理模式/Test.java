package 代理模式.静态代理模式;

public class Test {

	public static void main(String[] args) {
		BuyHouse bh = new 顾客();
		// 当前中介zj代理的是bh
		中介 zj = new 中介(bh);
		zj.buyHouse();
	}

}
