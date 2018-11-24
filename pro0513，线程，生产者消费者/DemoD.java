package pro0513;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoD {
	public Map<String, List<Integer>> map;
	public DemoD() {
		map = new HashMap<String,List<Integer>>();
		for (int i = 65; i < 75; i++) {
			char a = (char)i;
			List<Integer> list = new ArrayList<Integer>(); 
			for (int j = 0; j < 100; j++) {
				int m = (int)(Math.random()*500);
				list.add(m);
			}
			map.put(a+"", list);
		}
	}
	public static void main(String[] args) {
		DemoD d = new DemoD();
		int num = 98;
		for (char i = 65; i < 75; i++) {
			ListThread lt = new ListThread(i+"", d.map, num);
			lt.start();
		}
	}
}
class ListThread extends Thread{
	private String key;//指定哪个集合
	private Map<String, List<Integer>> map;//大集合
	private Integer num;//需要判断的数字
	public ListThread(String key, Map<String, List<Integer>> map,Integer num) {
		this.key = key;
		this.map = map;
		this.num = num;
	}
	public void run() {
		List<Integer> list = map.get(key);
		for (Integer i : list) {
			System.out.println("在"+key+"集合中匹配:"+num+"和"+i);
			if(i==num){
				System.out.println("在"+key+"集合中找到");
				break;
			}
		}
	}
}

