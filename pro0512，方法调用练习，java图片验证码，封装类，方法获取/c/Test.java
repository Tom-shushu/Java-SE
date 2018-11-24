package pro0512.c;

public class Test {

	public static void main(String[] args) {

		Ink color = new ColorInk();
		Ink grey = new GreyInk();

		Paper a4 = new A4TextPaper();
		Paper a6 = new A6TextPaper();

		Printer p = new Printer(grey, a4);

		p.print("shdfjkdhjkfhsdklfhsdlfhlsdfhasdjklhflsdfhsdjkhfjsdfhjsdfls");
	}

}
