package pro0401;

public class K {

	// 这里定义的2个参数a和b,他们是形式参数列表
	public void sum(int a, int b) {//数据类型,顺序
		System.out.println(a + "+" + b + "=" + (a + b));
	}

	public static void main(String[] args) {
		K k = new K();
		k.sum(5, 4);//实际参数列表
	}

}
