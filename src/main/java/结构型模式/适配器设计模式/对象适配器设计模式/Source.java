package 结构型模式.适配器设计模式.对象适配器设计模式;

import org.apache.log4j.Logger;

public class Source {
    Logger logger = Logger.getLogger(Source.class);
    public void editTextFile1(){
        logger.info("editTextFile1 执行了");
    }
}
