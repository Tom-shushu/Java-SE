package pro0401;

import java.util.Scanner;

//讲解数组
public class N {

	Scanner in = new Scanner(System.in);
	public void a() {
		// 定义了一个Int类型的数组i,长度为10
		int[] i = new int[10];
		// 1.如何获取数组长度 数组名.length
		int length = i.length;
		System.out.println(length);
		// 2.如何获取到数组中的某一个值数组名[下标]
		i[2] = 8;// 将8的值赋予了数组的第三个下标
		int a3 = i[2];
		System.out.println(a3);
		// 3.注意:数组的长度一经定义,不能改变,定长,数组中不能存放不同类型的元素
		// 4.数组常见的使用方式
		// 4.1:循环赋值方式
		for (int j = 0; j < i.length; j++) {
			i[j] = 8;
		}
		// 4.2:循环获取方式
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}

	public void b(){
		double [] score = {67,88,58,98,57};
		int length = score.length;
		
		double s1 = score[3];
		
		System.out.println(length);
		System.out.println(s1);
		for(int i=0;i<length;i++){
			System.out.print(score[i]+"\t");
		}
	}
	
	//有一个数组{8,4,6,2},任意输入一个数,判断这个数在数组中是否存在
	public void c(){
		boolean b = true;
		int []a = {8,4,6,2};
		System.out.println("请输入:");
		int num = in.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num){
				System.out.println("存在!");
				b = false;
				break;
			}
			
		}
		if(b){
			System.out.println("不存在!");
		}
	}
	
	//用户输入数组长度和数组内容
	public void d(){
		System.out.println("请输入数组长度");
		int [] a = new int[in.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个:");
			a[i] = in.nextInt();
		}
		
		System.out.println("-----------------------------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		N n = new N();
		n.d();
	}

}