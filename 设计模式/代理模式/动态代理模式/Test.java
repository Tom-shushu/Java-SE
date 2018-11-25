package 代理模式.动态代理模式;

public class Test {

	public static void main(String[] args) {
		UserMapper um = UserProxy.getMapper(UserMapper.class);
		um.addUser("张三", 25);
	}

}
