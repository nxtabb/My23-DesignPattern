package 结构型模式.代理设计模式.静态代理设计模式.Aop思想的静态代理模式;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceWithLog userServiceWithLog = new UserServiceWithLog();
        userServiceWithLog.setUserService(userService);
        userServiceWithLog.addUser();
        userServiceWithLog.updateUser();
        userServiceWithLog.deleteUser();
        userServiceWithLog.queryUser();
    }
}
