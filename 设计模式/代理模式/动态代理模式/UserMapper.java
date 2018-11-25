package 代理模式.动态代理模式;

public interface UserMapper {

	void addUser(String name, int age);

	void updateUser(String name, int age, int id);

	void deleteUser(int id);
}
