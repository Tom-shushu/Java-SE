package pro0401;

public class C {

	public static void main(String[] args) {
		/*
		int i = 1;
		int sum = 0;

		while (i < 11) {
			sum += i;// sum = sum + i;//累加
			i++;// i = i + 1;
		}
		*/

		
		int sum = 0;
		for(int i = 1;i<11;i++){
			sum+=i;
			
		}
		//1 2 4 3 2 4 3 ....
		System.out.println(sum);
		
	}
}
