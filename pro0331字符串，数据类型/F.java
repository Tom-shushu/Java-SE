package pro0331;

public class F {

	public static void main(String[] args) {
		
		//输入张三的成绩:如果成绩大于80,提示优秀
		int score = 87;
		
		if(score>80){
			System.out.println("优秀");;
		}
		
		System.out.println("结束!");
		
		
		System.out.println("-------------------------");

		//输入张三的成绩:如果成绩大于80,提示优秀,否则,提示,不优秀
		if(score>80){
			System.out.println("优秀");
		}else{
			System.out.println("不优秀");
		}
		
		System.out.println("-------------------------");
		//100 A  
		//85以上 B
		//60以上 C
		//其他D
		
		if(score==100){
			System.out.println("A");
		}else if(score>=85){
			System.out.println("B");
		}else if(score>=60){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
		//1.将以上多重if案例完善
		//2.用户输入一个代表年月日的8位整数,
		//判断这个日期是第几季度,并且判断是否是闰年
		
	}
}
