package pro0414.a;

import java.util.Arrays;
import java.util.Scanner;

public class Work {

	Scanner in = new Scanner(System.in);

	// 五：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
	public void a() {
		int[] a = new int[8];
		for (int i = 0; i < a.length; i++) {
			System.out.println("input:");
			a[i] = in.nextInt();
		}
		// 找出最大值和最小值的下标
		int min = a[0];
		int max = a[0];
		int minIndex = 0, maxIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				minIndex = i;
			}
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}
		System.out.println("Result:"+Arrays.toString(a));
		// 交换最大值和第一个元素
		int m = a[0];
		a[0] = a[maxIndex];
		a[maxIndex] = m;
		int n = a[a.length - 1];
		a[a.length - 1] = a[minIndex];
		a[minIndex] = n;
		System.out.println("Result:"+Arrays.toString(a));
		
	}
	
	//六：输入数组，返回数组中重复最多和重复最少的元素
	public void b(){
		int[] b = new int[8];//这个数组中存放a数组中的元素次数
		int[] a = new int[8];
		for (int i = 0; i < a.length; i++) {
			System.out.println("input:");
			a[i] = in.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j]){
					b[i]++;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		//求出B数组的最大值下标和最小值下标
		int min = b[0];
		int max = b[0];
		int minIndex = 0, maxIndex = 0;
		for (int i = 1; i < b.length; i++) {
			if (min > b[i]) {
				min = b[i];
				minIndex = i;
			}
			if (max < b[i]) {
				max = b[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex+"..."+minIndex);


		System.out.println(a[maxIndex]);
		System.out.println(a[minIndex]);
		
	}
	
	/*
	 *十：现在有如下的一个数组：   
int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   
要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：  
int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} 
	 */
	public void c(){
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
		int num = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i]==0){
				num++;
			}
		}
		int []newArr = new int[oldArr.length-num];
		int k = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i]!=0){
				newArr[i-k] = oldArr[i];
			}else{
				k++;
			}
		}
		System.out.println(Arrays.toString(oldArr));
		System.out.println(Arrays.toString(newArr));
	}
	
	//十六：某单位用现金发放工资，编写程序计算各种面值的最佳张数， 以保证发给职工工资时不需找零。
	//职工工资与各种面值的张数均要求用数组描述。
	int [] arr = {100,50,20,10,5,1};//100 50 20 10 5 1
	int [] arrz = new int[6];
	int index = 0;
	public void d(){
		System.out.println("请输入钱数:");
		int money = in.nextInt();
		d1(money,arr[index]);
		System.out.println(money+"\t"+Arrays.toString(arrz));
	}
	
	public void d1(int money,int k){//money:钱数, k是面值
		int z = money/k;//z:张数
		money -= k*z;
		arrz[index] = z;
		index++;
		if(index<6){
			d1( money, arr[index] );
		}
	}
	
	/*
	 * 十七：编写n个学生、m门课程的成绩处理程序： 
(1) 实际学生人数、课程门数由键盘输入。 

(2) n个学生、m门课程的成绩用二维实型数组描述，同时考虑学生
姓名、学号数据。 

(3) 求出每个学生的总成绩、平均成绩、并按总成绩排序。 
(4) 求出每门课程的平均成绩和不及格的人数。
	 */
	public void e(){
		Student [] stus = new Student[3];
		
		Student s1 = new Student();
		
		Subject []s1s = new Subject[2];
		
		Subject s11 = new Subject();
		s11.setSubjectName("语文");
		s11.setSubjectSocre(89.8);
		
		Subject s12 = new Subject();
		s12.setSubjectName("数学");
		s12.setSubjectSocre(77.0);
		
		s1s[0] = s11;
		s1s[1] = s12;
		
		s1.setStuName("张三");
		s1.setSubjects(s1s);

		stus[0] = s1;
		
	}
	public static void main(String[] args) {
		new Work().e();
	}

}
