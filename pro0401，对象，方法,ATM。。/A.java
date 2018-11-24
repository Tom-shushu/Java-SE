package pro0401;

public class A {
	// 单行注释

	/*
	 * 多行注释
	 */

	public static void main(String[] args) {

		// 求出1-10之和

		int i = 1;
		int sum = 0;

		while (i < 11) {
			sum += i;// sum = sum + i;//累加
			i++;// i = i + 1;
		}

		System.out.println("1-10:" + sum);

		/*
		 * 输出如下格式 1 + 7 = 8; 2 + 6 = 8; 3 + 5 = 8; 4 + 4 = 8; 5 + 3 = 8; 6 + 2 =
		 * 8; 7 + 1 = 8;
		 */

		System.out.println("-----------------------");

		int a = 1;
		int b = 7;
		while (a < 8) {
			System.out.println(a + "+" + b + "=" + (a + b));
			a++;
			b--;
		}

	}
}
