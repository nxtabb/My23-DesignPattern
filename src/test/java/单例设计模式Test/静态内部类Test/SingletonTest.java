package 单例设计模式Test.静态内部类Test;

import org.junit.Test;
import 单例设计模式.静态内部类.Singleton;

public class SingletonTest {
    @Test
    public void test01(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());;
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.equals(singleton2));
    }
}
