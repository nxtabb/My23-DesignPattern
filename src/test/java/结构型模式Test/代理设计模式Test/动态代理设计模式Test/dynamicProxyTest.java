package 结构型模式Test.代理设计模式Test.动态代理设计模式Test;

import org.junit.Test;
import 结构型模式.代理设计模式.动态代理设计模式.MyInvocationHandler;
import 结构型模式.代理设计模式.动态代理设计模式.UserService;
import 结构型模式.代理设计模式.动态代理设计模式.UserServiceImplBySSM;
import 结构型模式.代理设计模式.动态代理设计模式.UserServiceImplBySpringBoot;

public class dynamicProxyTest {
    @Test
    public void test01(){
        UserService userService1 = new UserServiceImplBySpringBoot();
        UserService userService2 = new UserServiceImplBySSM();
        MyInvocationHandler invocationHandler = new MyInvocationHandler();
        invocationHandler.setTarget(userService1);
        UserService proxy1 = (UserService) invocationHandler.getProxy();
        proxy1.addUser();
        invocationHandler.setTarget(userService2);
        UserService proxy2 = (UserService) invocationHandler.getProxy();
        proxy2.addUser();
    }
}
