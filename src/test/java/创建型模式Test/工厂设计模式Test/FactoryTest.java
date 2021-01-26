package 创建型模式Test.工厂设计模式Test;

import org.junit.Test;
import 创建型模式.工厂设计模式.Factory;
import 创建型模式.工厂设计模式.Phone;

public class FactoryTest {
    @Test
    public void test01(){
        Factory factory = new Factory();
        Phone iphone = factory.createPhone("iphone");
        iphone.call();
        Phone huawei = factory.createPhone("huawei");
        huawei.call();
    }
}
