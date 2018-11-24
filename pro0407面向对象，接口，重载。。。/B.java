package pro0407;

import java.util.Arrays;

public class B {

	public void a() {
		// 二维数组里边嵌入的就是一维数组
		int[][] a = { { 98, 25, 11 }, { 96, 14, 12, 87 }, { 88, 9, 69 }, { 18, 54, 36 } };

		for (int i = 0; i < a.length; i++) {
			int[] b = a[i];
			for (int j = 0; j < b.length; j++) {
				int m = b[j];
				System.out.print(m + "\t");
			}
			System.out.println();
		}
	}

	public void b() {
		String[][] b = new String[5][3];
		double[][][] c = new double[4][3][2];
		char[] e = new char[3];
		boolean[] d = new boolean[3];
		System.out.println(b[0][1]);
		System.out.println(c[2][1][1]);
		System.out.println(e[1]);
		System.out.println(d[1]);
	}

	// 累加数组的值
	public void c() {
		int[] a = { 98, 59, 67, 16, 39, 87 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];// 累加操作
		}
		System.out.println(sum / a.length);
	}

	// 求出数组中的最大元素,打擂台模式
	public void d() {
		int[] a = { 78, 59, 67, 96, 39, 87 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				// max现在就是a[i]
				max = a[i];
			}
		}
		System.out.println("数组中的最大值:" + max);
	}

	// 使用冒泡排序方式进行数组排序
	public void e1() {
		int[] a = { 78, 59, 67, 96, 39, 87 };
		for (int j = 0; j < a.length; j++) {
			int k = 0;
			int max = a[k];
			for (int i = 1; i < a.length - j; i++) {
				if (a[i] < max) {
					// 交换位置
					int m = a[i];
					a[i] = a[k];
					a[k] = m;
				}
				k = i;
				max = a[k];
			}
			k = 0;
		}
		System.out.println(Arrays.toString(a));
	}

	//实现了排序方式
	public void e2(){
		int[] a = { 78, 59, 67, 96, 39, 87 };
		Arrays.sort(a);//对a数组进行了排序操作,调用方法后,数组的顺序发生了改变
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {

		// 匿名对象
		new B().e2();
	}

}
