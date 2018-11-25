package 适配器模式.类适配器模式;

public class 转换接头 extends 苹果手机 implements 安卓充电器接口{

	@Override
	public void 充电2() {
		System.out.println("苹果手机使用安卓充电器充电");
	}
}