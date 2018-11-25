package 适配器模式.对象适配器模式;

public class 转换接头 implements 安卓充电器接口{

	private 苹果手机 iphone;
	
	public 转换接头(苹果手机 iphone) {
		super();
		this.iphone = iphone;
	}

	@Override
	public void 充电2() {
		iphone.充电1();
	}

}
