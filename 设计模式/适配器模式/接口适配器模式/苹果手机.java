package 适配器模式.接口适配器模式;

public class 苹果手机 extends 转换器{

	@Override
	public void 苹果充电() {
		System.out.println("使用苹果充电器");
	}
	public void 安卓充电() {
		System.out.println("使用安卓充电器");
	}
}
