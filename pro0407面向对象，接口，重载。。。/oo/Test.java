package pro0407.oo;

public class Test{

	public void a(){
		Book b = new Book();

		b.setBookName("��¥��");
		b.setBookPage(-199);
		b.setBookPrice(99.8);
		
		System.out.println(b);
	}

	public void b(){
		���� e = new ����();
		e.���� = "����";
		
		e.����();
	}
	
	public void c(){
		A b = new B();
		b.a();
	}
	//��ʽ����ͨ��
	public void d(˾�� sj){
		sj.����();
		sj.ֹͣ();
		sj.toString();
	}
	
	public void e(){
		���� c = new ����();
		c.a(4,"a");
	}
	
	
	public static void main(String[] args) {
		//ʵ�ʲ�������
		//˾�� sj1 = new ���⳵˾��("����");
		System.out.println(true);
		Test t = new Test();
		t.e();
	}

}
