package test;

import java.util.List;

import bean.manytoone.a.StuInfo;
import biz.manytoone.a.StuBiz;

public class B {

	public static void main(String[] args) {
		StuBiz sb = new StuBiz();
		List<StuInfo> list = sb.findAllStu();
		for (StuInfo si : list) {
			System.out.println(si);
		}
	}

}
