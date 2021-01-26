package 创建型模式Test.单例设计模式Test.双重校验锁Test;

import org.junit.Test;
import 创建型模式.单例设计模式.双重校验锁.DoubleLockSingleton;

public class DoubleLockSingletonTest {
    @Test
    public void test01(){
        DoubleLockSingleton doubleLockSingleton1 = DoubleLockSingleton.getInstance();
        DoubleLockSingleton doubleLockSingleton2 = DoubleLockSingleton.getInstance();
        System.out.println(doubleLockSingleton1.equals(doubleLockSingleton2));
    }
}
