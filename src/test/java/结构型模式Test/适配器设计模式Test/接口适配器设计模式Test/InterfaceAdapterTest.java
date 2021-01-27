package 结构型模式Test.适配器设计模式Test.接口适配器设计模式Test;

import org.junit.Test;
import 结构型模式.适配器设计模式.接口适配器设计模式.InterFaceAdapter1;
import 结构型模式.适配器设计模式.接口适配器设计模式.InterFaceAdapter2;
import 结构型模式.适配器设计模式.接口适配器设计模式.Source;

public class InterfaceAdapterTest {
    @Test
    public void test01(){
        Source source1 = new InterFaceAdapter1();
        source1.editTextFile01();
        source1.editTextFile02();
        Source source2 = new InterFaceAdapter2();
        source2.editTextFile02();
        source2.editTextFile01();

    }
}
