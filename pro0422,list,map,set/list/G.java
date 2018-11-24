package pro0422.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap
public class G {

	// Map的构建
	public void a() {
		// Map结构:键值对结构,k-v
		// K:key的缩写,代表唯一标识,别名
		// V:value的缩写,代表确切的'值'
		// Map<K, V> map = new HashMap<K,V>();

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		// 向map集合中添加内容
		map1.put("张三", 5);
		map1.put("李四", 3);
		map1.put("王五", 5);
		map1.put("王五", 8);// 后边的key会把前边的覆盖

		// 获取到内容
		Integer v1 = map1.get("张三");
		Integer v2 = map1.get("李四");
		Integer v3 = map1.get("王五");
		System.out.println(v1 + "\t" + v2 + "\t" + v3);

		// key:一般我们会使用String或者Integer类型
		// value:一般都是Object的子类
		Set<String> keys = map1.keySet();// 获取到所有的key,返回的是一个set类型
		Collection<Integer> values = map1.values();// 获取到所有的value



		int len = map1.size();
		System.out.println(len);

		boolean b1 = map1.containsKey("张三");// 判断是否有重复的key
		boolean b2 = map1.containsValue(2);// 判断是否有重复的value

		System.out.println(b1 + "\t" + b2);
		
		//Map结构的遍历:其实就是对里边键集和值集的遍历
		for (Integer i : values) {
			System.out.println(i);
		}
		
		for (String s : keys) {
			System.out.println(s);
		}
		//清空
		map1.clear();
		//按照key移除某个值
		map1.remove("张三");
		
		System.out.println(Arrays.toString(keys.toArray()));
		System.out.println(Arrays.toString(values.toArray()));
		
		
	}

	public static void main(String[] args) {
		new G().a();
	}
}
