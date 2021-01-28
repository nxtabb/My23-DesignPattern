package 结构型模式Test.代理设计模式Test.静态代理设计模式Test;

import org.junit.Test;
import 结构型模式.代理设计模式.静态代理设计模式.Host;
import 结构型模式.代理设计模式.静态代理设计模式.Proxy;

public class StaticProxyTest {
    @Test
    public void test01(){
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
