package pro0513.生产者消费者;

public class Test {
	
	public static void main(String[] args) {
		
		经销商 j = new 经销商();
		消费者 x = new 消费者(j);
		生产者 s = new 生产者(j);
		
		x.start();
		s.start();
		
	}
}