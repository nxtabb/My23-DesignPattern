package 抽象工厂设计模式Test;

import org.junit.Test;
import 抽象工厂设计模式.*;

public class AbstractFactoryTest {
    @Test
    public void test01(){
        AbstractFactory phoneFactory = new PhoneFactory();
        ComputerFactory computerFactory = new ComputerFactory();
        Phone iphoneXs = phoneFactory.createPhone("iphoneXs");
        iphoneXs.call();
        Computer macBookPro = computerFactory.createComputer("MacBookPro");
        macBookPro.internet();

    }
}
