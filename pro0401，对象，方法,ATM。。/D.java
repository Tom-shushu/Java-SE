package pro0401;

public class D {

	public static void main(String[] args) {
		
		//1-100中前十个偶数,遍历出来
		int i = 1;
		int num = 0;
		while(i<=100){
			if(i%2==0){
				num++;
				System.out.println(i);
			}
			if(num==10){
				break;//终止(结束)循环
			}
			i++;
		}
		
		
		//如何找到足够的内容之后,终止循环 break;
	}

}
