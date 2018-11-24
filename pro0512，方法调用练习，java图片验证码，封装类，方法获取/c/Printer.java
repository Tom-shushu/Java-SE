package pro0512.c;

public class Printer {

	private Ink ink;
	private Paper paper;
	
	public Printer() {
	}

	public Printer(Ink ink, Paper paper) {
		this.ink = ink;
		this.paper = paper;
	}
	
	public void print(String str){
		ink.color();
		paper.print(str);
	}
}
