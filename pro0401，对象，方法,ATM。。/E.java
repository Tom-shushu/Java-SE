package pro0401;

public class E {

	public static void main(String[] args) {
		//С���μ�4000���ܲ�
		int i = 0;
		while(i<10){
			if(i==4){
				i++;
				continue;
			}
			System.out.println("���˵�"+(i+1)+"Ȧ");
			i++;
		}
	}
}
