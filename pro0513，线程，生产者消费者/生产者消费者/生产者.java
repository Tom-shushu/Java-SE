package pro0513.生产者消费者;

public class 生产者 extends Thread {
	private 经销商 j;

	public 生产者(经销商 j) {
		this.j = j;
	}

	public void run() {
		for (int i = 1; i < 21; i++) {
			
			商品 g = new 商品(i);//生产商品
			System.out.println("生产了"+g);
	
			j.进货(g);//生产好之后,发货
			try {
				Thread.sleep(1000);//每隔4秒生产一个商品
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
