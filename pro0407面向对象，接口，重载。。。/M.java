package pro0407;

public class M {

	public int a() {
		int x = 1;
		try {
			x += 3;
			return x;
		} finally {
			x++;
		}

	}

	public static void main(String[] args) {
		System.out.println(new M().a());
	}

}
