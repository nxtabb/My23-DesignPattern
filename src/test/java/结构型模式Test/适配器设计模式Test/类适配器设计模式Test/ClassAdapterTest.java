package 结构型模式Test.适配器设计模式Test.类适配器设计模式Test;

import org.junit.Test;
import 结构型模式.适配器设计模式.类适配器设计模式.Adapter;
import 结构型模式.适配器设计模式.类适配器设计模式.Target;

public class ClassAdapterTest {
    @Test
    public void test01(){
        Target target = new Adapter();
        target.editTextFile1();
        target.editTextFile2();
    }
}
