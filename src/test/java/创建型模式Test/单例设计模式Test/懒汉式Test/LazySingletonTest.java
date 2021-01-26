package 创建型模式Test.单例设计模式Test.懒汉式Test;

import org.junit.Test;
import 创建型模式.单例设计模式.懒汉式.LazySingleton;

public class LazySingletonTest {
    @Test
    public void test01(){
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());
        System.out.println(lazySingleton2.hashCode());
        System.out.println(lazySingleton1.equals(lazySingleton2));
    }
}
