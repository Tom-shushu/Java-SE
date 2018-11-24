package pro0512.c;

public class A6TextPaper implements Paper {

	@Override
	public void print(String str) {
		char[] c = str.toCharArray();
		for (int i = 1; i < c.length + 1; i++) {
			System.out.print(c[i - 1]);

			if (i % 12 == 0) {
				System.out.println("");
			}

		}
	}

}
