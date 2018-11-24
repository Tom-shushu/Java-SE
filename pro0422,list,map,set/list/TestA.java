package pro0422.list;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestA {
	private Scanner in = new Scanner(System.in);

	/*
	 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
	 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
	 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
	 * 
	 */
	public void a() {
		System.out.println("请输入数组长度:");
		int len = in.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个:");
			arr[i] = in.nextInt();
		}
		if (len == 0) {
			System.out.println(0);
		} else {
			int k = (int) (Math.random() * (len - 1) + 1);
			int[] arr2 = new int[len];
			int m = 0;
			System.out.println("挪动" + k + "个位置");
			for (int i = 0; i < arr2.length; i++) {
				if (i + k < arr2.length) {
					arr2[i] = arr[i + k];
				} else {
					arr2[i] = arr[m];
					m++;
				}
			}
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(arr[i] + "\t" + arr2[i]);
			}
		}
	}

	public void b() {
		Set<Integer> set = new TreeSet<Integer>();
		int[] a = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {

					if (a[i] != a[j] && a[i] != a[k] && a[j] != a[k]) {
						String str = a[i] + "" + a[j] + "" + a[k];
						int num = Integer.parseInt(str);
						if (num >= 100 && num <= 999) {
							set.add(num);
						}
					}
				}
			}
		}
		System.out.println(set.size());
	}

	public void c() {
		double c1 = 2, c2 = 3;
		double b1 = 1, b2 = 2;
		double sum = c1 / b1 + c2 / b2;
		for (int i = 0; i < 18; i++) {
			double k1 = c1 + c2;
			c1 = c2;
			c2 = k1;

			double k2 = b1 + b2;
			b1 = b2;
			b2 = k2;

			System.out.println(k1 + "\t" + k2);
			sum += k1 / k2;

		}
		System.out.println(sum);
	}

	int count = 1;
	public void d(int a){
		if(count==5){
			System.out.println("第"+count+"个人岁数:"+a);
		}else{
			a = a + 2;
			count++;
			d(a);
		}
	}
	
	
	public static void main(String[] args) {
		new TestA().d(10);
	}

}
