package test;

import java.util.List;

import bean.onetomany.ClassInfo;
import biz.onetomany.ClassBiz;

public class D {

	public static void main(String[] args) {
		ClassBiz cb = new ClassBiz();
		List<ClassInfo> list = cb.findAllClass();
		for (ClassInfo ci : list) {
			System.out.println(ci);
		}
	}

}
