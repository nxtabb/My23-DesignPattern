package 创建型模式Test.建造者设计模式Test;

import org.junit.Test;
import 创建型模式.建造者设计模式.*;

public class BuilderTest {
    @Test
    public void test01(){
        Builder nongMin = new NongMin();
        Commander commander = new Commander();
        Product product1 = commander.command(nongMin);
        System.out.println(product1);

        Builder gongRen = new GongRen();
        Product product2 = commander.command(gongRen);
        System.out.println(product2);

    }
}
