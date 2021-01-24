package 单例设计模式Test.饿汉式Test;

import org.junit.Test;
import 单例设计模式.饿汉式.HungrySingleton;

public class HungrySingletonTest {
    @Test
    public void test01(){
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1.hashCode());
        System.out.println(hungrySingleton2.hashCode());
        System.out.println(hungrySingleton1.equals(hungrySingleton2));
    }
}
