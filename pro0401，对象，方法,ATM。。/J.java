package pro0401;

public class J {

	//�����������,ʲô���ò���,����ֻ��ִ���˷�����
	public void a(){
		System.out.println("aaaaaaaaa");
	}
	
	//�����������,�ܹ��õ�'һ'��int���͵�ֵ,����ִ���˷�����
	public int b(){
		System.out.println("bbbbbbbbb");
		return 5;
	}
	
	public String c(){
		System.out.println("ccccccccc");
		return "ccc";
	}
	
	public static void main(String[] args) {
		J j = new J();
		j.a();
		
		int b = j.b();
		System.out.println(b);
		
		String c = j.c();
		System.out.println(c);
		
	}
}
