package 结构型模式.适配器设计模式.类适配器设计模式;


import org.apache.log4j.Logger;

public class Source {
    private static org.apache.log4j.Logger logger = Logger.getLogger(Source.class);
    public void editTextFile1(){
        logger.debug("editTextFile1 方法生效了");
    }
}
