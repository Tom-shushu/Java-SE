package pro0401;

public class D {

	public static void main(String[] args) {
		
		//1-100��ǰʮ��ż��,��������
		int i = 1;
		int num = 0;
		while(i<=100){
			if(i%2==0){
				num++;
				System.out.println(i);
			}
			if(num==10){
				break;//��ֹ(����)ѭ��
			}
			i++;
		}
		
		
		//����ҵ��㹻������֮��,��ֹѭ�� break;
	}

}
