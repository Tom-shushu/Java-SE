package 适配器模式.对象适配器模式;

public class Test {

	public static void main(String[] args) {
		苹果手机 iphone = new 苹果手机();
		转换接头 zh = new 转换接头(iphone);
		zh.充电2();
	}

}
