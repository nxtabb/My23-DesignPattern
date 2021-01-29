package 结构型模式.代理设计模式.动态代理设计模式;

public class UserServiceImplBySSM implements UserService {
    @Override
    public void addUser() {
        System.out.println("ssm 添加用户");
    }

    @Override
    public void queryUser() {
        System.out.println("ssm 查询用户");
    }

    @Override
    public void updateUser() {
        System.out.println("ssm 更新用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("ssm 删除用户");
    }
}
