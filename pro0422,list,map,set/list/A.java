package pro0422.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//ArrayList
public class A {

	//如何产生一个ArrayList集合
	public void a(){
		//泛型:泛泛的类型,口头去说,其实就是规定了集合中只能存放哪种类型的数据
		List<String> list1 = new ArrayList<String>();
		
		List<String> list2 = new ArrayList<String>(list1);
		
		//规范期间:希望定义的广一些,产生的具体一些
		//String[] arr = new String[10];
	}
	
	
	//常见方法
	public void b(){
		List<String> list = new ArrayList<String>();
		//添加内容
		list.add("陕西");
		list.add("山西");
		list.add("湖北");
		//插入内容
		list.add(1,"广东");
		//获取到集合长度
		int len = list.size();
		
		System.out.println("集合中一共有:"+len);
		String str1 = list.get(0);
		String str2 = list.get(1);
		String str3 = list.get(2);
		String str4 = list.get(3);
		System.out.println(str1+"\t"+str2+"\t"+str3+"\t"+str4);
		
		//通过循环遍历显示集合元素
		for(int i=0;i<len;i++){
			String str = list.get(i);
			System.out.println(str);
		}
		
		
	}
	
	//遍历对象
	public void c(){
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i);
			list.add(s);
		}
		int len = list.size();
		System.out.println("长度为:"+len);
		//普通方式遍历
		for (int i = 0; i < len; i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
	}
	
	//游标模式(迭代器模式)
	public void d(){
		List<Student> list = new ArrayList<Student>();
		Student[] arr = new Student[10];
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i);
			list.add(s);
			arr[i] = s;
		}
		
		//游标模式遍历
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s);
		}
		//缩写的游标写法 ForEach
		for(Student s:list){
			System.out.println(s);
		}
		System.out.println("-----------------------------------");
		for(Student s:arr){
			System.out.println(s);
		}
		/*
		for(泛型 对象名:集合){
			
		}
		*/
	}
	
	public void e(){
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i);
			list.add(s);
		}
		
		boolean b = list.isEmpty();
		System.out.println(b);
		
		list.set(2, null);
		
		System.out.println(list.size());
		
		list.remove(2);
		list.remove(list.get(7));
		System.out.println(list.size());
		
		Object [] arr = list.toArray();
		for (Object o : arr) {
			System.out.println(o);
		}
		
		list.clear();
		System.out.println(list.size());
		
	}
	
	//拆箱装箱操作
	public void f(){
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s = new Student(i);
			list.add(s);
		}
		
		//对list这个集合中性别为女的人,年龄设置为0
		for (Student s : list) {
			if(s.getStuSex().equals("女")){
				s.setStuAge(0);
			}
		}
		
		Object [] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void main(String[] args) {
		new A().f();
	}
	
}
