package 结构型模式.代理设计模式.静态代理设计模式.Aop思想的静态代理模式;

public class UserServiceImpl implements UserService{
    public void addUser() {
        System.out.println("系统成功添加用户");
    }

    public void updateUser() {
        System.out.println("系统成功修改用户");
    }

    public void deleteUser() {
        System.out.println("系统成功删除用户");
    }

    public void queryUser() {
        System.out.println("系统成功查询用户");
    }
}
