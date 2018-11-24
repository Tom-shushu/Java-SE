package pro0407.oo;

public class Book {
	//第一步:将属性私有化
	private String bookName;
	private int bookPage;
	private double bookPrice;

	//第二步:提供公开接口方法这些私有属性
	//一个属性有两个操作,set/get
	public String getBookName(){
		return bookName;
	}
	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
	public int getBookPage(){
		return bookPage;
	}
	
	public void setBookPage(int bookPage){
		if(bookPage>0){
			this.bookPage = bookPage;
		}else{
			this.bookPage = 0;
		}
	}
	
	public double getBookPrice(){
		return bookPrice;
	}
	
	public void setBookPrice(double bookPrice){
		this.bookPrice = bookPrice;
	}
	
	public String toString() {
		return "书名:" + bookName + ",页码:" + bookPage + ",价格:" + bookPrice;
	}
}

/*
 * 
 * private Type xxx;
 * 
 * public Type getXxx();
 * 
 * public void setXxx(Type type);
 * 
 * 
 */



