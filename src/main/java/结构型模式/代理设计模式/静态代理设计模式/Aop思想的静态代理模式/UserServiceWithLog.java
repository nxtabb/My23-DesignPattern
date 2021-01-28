package 结构型模式.代理设计模式.静态代理设计模式.Aop思想的静态代理模式;

public class UserServiceWithLog implements UserService {
    private UserServiceImpl userServiceImpl;
    public UserServiceWithLog(){}

    public void setUserService(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public void addUser() {
        log("addUser");
        userServiceImpl.addUser();
    }

    public void updateUser() {
        log("updateUser");
        userServiceImpl.updateUser();
    }

    public void deleteUser() {
        log("deleteUser");
        userServiceImpl.deleteUser();
    }

    public void queryUser() {
        log("queryUser");
        userServiceImpl.queryUser();
    }
    public void log(String name){
        System.out.println("日志打印"+name+"方法前");
    }
}
