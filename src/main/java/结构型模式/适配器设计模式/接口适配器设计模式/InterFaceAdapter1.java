package 结构型模式.适配器设计模式.接口适配器设计模式;

import org.apache.log4j.Logger;

public class InterFaceAdapter1 extends AbstractSource {
    Logger logger = Logger.getLogger(InterFaceAdapter1.class);
    @Override
    public void editTextFile01() {
        logger.info("InterFaceAdapter1 实现了");
    }
    @Override
    public void editTextFile02() {
    }
}
