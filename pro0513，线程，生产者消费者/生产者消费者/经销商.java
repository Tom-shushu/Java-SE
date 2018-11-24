package pro0513.生产者消费者;

import java.util.ArrayList;
import java.util.List;
//这里就是一个容器
public class 经销商 {

	private List<商品> list = new ArrayList<商品>();
	private int max = 10;//经销商的场地只能存放10个商品
	
	public synchronized 商品 售卖(){
		while(list.size()==0){
			System.out.println("现在没货了,需要等待");
			try {
				wait();//现在没货了,需要等待
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//当唤醒时为止
		notify();
		
		商品 s = list.get(0);
		list.remove(0);//卖出去了
		return s;
	}
	
	
	public synchronized void 进货(商品 s){
		while(list.size()>=max){
			System.out.println("货仓已满,请不要生产了!");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		notify();
		list.add(s);
	}

}
