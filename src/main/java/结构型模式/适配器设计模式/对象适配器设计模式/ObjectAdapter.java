package 结构型模式.适配器设计模式.对象适配器设计模式;

import org.apache.log4j.Logger;

public class ObjectAdapter implements Target {
    Logger logger = Logger.getLogger(ObjectAdapter.class);
    private Source source;

    public ObjectAdapter() {
    }

    public ObjectAdapter(Source source){
        this.source = source;
    }

    public void editTextFile1() {
        this.source.editTextFile1();
    }

    public void editTextFile2() {
        logger.info("editTextFile2 执行了");
    }
}
