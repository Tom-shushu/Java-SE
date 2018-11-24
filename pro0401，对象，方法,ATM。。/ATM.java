package pro0401;

import java.util.Scanner;

public class ATM {

	int pass = 1234;// 密码
	int monty = 8765;// 个人余额
	int errorNum = 0;// 记录错误次数
	Scanner in = new Scanner(System.in);

	public void checkPass() {
		System.out.println("请输入密码:");
		int pass = in.nextInt();

		if (this.pass == pass) {
			this.mainView();
		} else {
			System.out.println("密码输入错误!");
			if (errorNum == 2) {
				System.out.println("你已经连续输入错误3次,吞卡!");
			} else {
				errorNum++;
				this.checkPass();
			}
		}
	}

	public void mainView() {
		System.out.println("**********************");
		System.out.println("***欢迎访问中国XX银行ATM系统***");
		System.out.println("**********************");
		System.out.println("请选择您的操作:");
		System.out.println("1.查询");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.退出");
		int s = in.nextInt();

		switch (s) {
		case 1:
			this.查询();
			break;
		case 2:
			this.存款();
			break;
		case 3:
			this.取款();
			break;
		case 4:
			this.退出();
			break;
		default:
			System.out.println("输入错误!");
			this.mainView();
			break;
		}

	}

	public void 查询() {
		System.out.println("你的个人余额:" + this.monty);
		this.mainView();
	}

	public void 存款() {
		System.out.print("请输入存款金额:");
		int money = in.nextInt();
		this.monty += money;
		this.mainView();
	}

	public void 取款() {
		System.out.print("请输入取款金额:");
		int money = in.nextInt();
		this.monty -= money;
		this.mainView();
	}

	public void 退出() {
		System.out.println("再见!");
	}

	public static void main(String[] args) {
		ATM a = new ATM();
		a.checkPass();
	}
}

/*
作业:
完善ATM系统
1.登录,错误3此吞卡
2.主功能有:查询,改密,存款,取款,退出
3.改密成功后,重新登录
4.存款只接受100面值
5.取款只接受100面值,余额不能小于1,单次取款不能超过20000
6.退出时,必须打印详单(每次操作)
*/