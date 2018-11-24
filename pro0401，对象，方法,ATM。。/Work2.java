package pro0401;

public class Work2 {

	//4.1-10之间求和,得到刚好大于20的那个数
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i<11;i++){
			sum+=i;
			if(sum>20){
				System.out.println(i);
				break;
			}
			
		}
	}

}
