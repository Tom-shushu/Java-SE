﻿package 适配器模式.对象适配器模式;

public class 苹果手机 implements 苹果充电器接口{

	@Override
	public void 充电1() {
		System.out.println("苹果手机充电");
	}

}
