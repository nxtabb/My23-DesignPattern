package 结构型模式.适配器设计模式.类适配器设计模式;


import org.apache.log4j.Logger;

public class Adapter extends Source implements Target {
    private static Logger logger = Logger.getLogger(Adapter.class);
    public void editTextFile2() {
        logger.info("editTextFile2 方法生效了");
    }
}
