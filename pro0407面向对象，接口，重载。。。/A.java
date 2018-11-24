package pro0407;

public class A {

	public static void main(String[] args) {
		int i = 9;
		int[] arrays = { 69, 55, 87, };
		System.out.println(i);
		System.out.println(arrays.toString());
		//使用数组的内容 下标
		System.out.println(arrays[0]);
		System.out.println(arrays[1]);
		System.out.println(arrays[2]);

		for (int j = 0; j < arrays.length; j++) {
			System.out.println(arrays[j]);
		}
	}

}
