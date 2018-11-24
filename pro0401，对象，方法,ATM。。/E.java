package pro0401;

public class E {

	public static void main(String[] args) {
		//小明参加4000米跑步
		int i = 0;
		while(i<10){
			if(i==4){
				i++;
				continue;
			}
			System.out.println("跑了第"+(i+1)+"圈");
			i++;
		}
	}
}
