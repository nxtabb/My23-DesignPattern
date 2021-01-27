package 结构型模式.适配器设计模式.接口适配器设计模式;

import org.apache.log4j.Logger;

public class InterFaceAdapter2 extends AbstractSource{
    Logger logger = Logger.getLogger(InterFaceAdapter2.class);
    @Override
    public void editTextFile02() {
        logger.info("InterFaceAdapter2 实现了");
    }
    @Override
    public void editTextFile01() {
    }
}
