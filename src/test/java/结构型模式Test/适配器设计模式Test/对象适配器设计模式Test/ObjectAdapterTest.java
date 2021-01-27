package 结构型模式Test.适配器设计模式Test.对象适配器设计模式Test;

import org.junit.Test;
import 结构型模式.适配器设计模式.对象适配器设计模式.ObjectAdapter;
import 结构型模式.适配器设计模式.对象适配器设计模式.Source;
import 结构型模式.适配器设计模式.对象适配器设计模式.Target;

public class ObjectAdapterTest {
    @Test
    public void test01(){
        Source source = new Source();
        Target target = new ObjectAdapter(source);
        target.editTextFile1();
        target.editTextFile2();
    }
}
