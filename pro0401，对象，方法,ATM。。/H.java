package pro0401;

public class H {

	
	public static void main(String[] args) {
		//��δ���һ������ new
		//�� ������ = new ��(������);
		//1.��������
		Student s1 = new Student();
		//2.��ֵ����,��Ե������� .
		s1.name = "����";
		s1.age = 19;
		s1.sex = '��';
		//3.���÷���   .
		s1.����();
		s1.�Է�();
		s1.ѧϰ();
		
		
		Student s2 = new Student();
		s2.name = "����";
		s2.age = 18;
		s2.sex = 'Ů';
		s2.����();
		s2.�Է�();
		s2.ѧϰ();
		
	}
}
