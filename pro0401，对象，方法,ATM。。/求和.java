package pro0401;

public class 求和 {

	int i = 1;
	int sum = 0;
	
	//递归调用
	public void sum(){
		sum+=i; // 1+0
		i++;
		if(i==101){
			System.out.println(sum);
		}else{
			this.sum();
		}
	}
	
	
	/*
	 * ***********************
	 */
	int count = 0;
	public void a(){
		System.out.print("*");
		count++;
		if(count<10){
			this.a();
		}
	}
	/*
	 * ***********************
	 * ***********************
	 * ***********************
	 * ***********************
	 * ***********************
	 * ***********************
	 */
	int count1 = 0;
	int count2 = 0;
	public void b1(){
		for (int i = 0; i < 2; i++) {
			
			this.b2();
			
			System.out.println();
			count2 = 0;
		}
	}
	
	public void b2(){
		System.out.print("*");
		count2++;
		if(count2<10){
			this.b2();
		}
	}
	
	//使用递归实现1-100之间素数和
	int sum3 = 0;//求和
	
	public void c1(){
		for (int i = 3; i < 101; i++) {
			c2(i);
		}
		System.out.println(sum3);
	}
	
	/*
	 * 这个方法负责判断一个数是否是素数
	 */
	public void c2(int num){
		boolean b = true;
		for (int i = 2; i < num; i++) {
			if(num%i==0){
				b = false;
				break;
			}
		}
		
		if(b){
			System.out.println(num);
			sum3+=num;
		}
	}
	
	
	public static void main(String[] args) {
		求和 j = new 求和();
		j.c1();
		
	}
	
	
}
