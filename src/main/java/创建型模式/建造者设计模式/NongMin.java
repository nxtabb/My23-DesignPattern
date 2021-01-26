package 创建型模式.建造者设计模式;

public class NongMin extends Builder {
    Product product;
    public NongMin(){
        product = new Product();
    }
    void fun1() {
        System.out.println("开始工作1");
        product.setComment1("工作1完成");
    }

    void fun2() {
        System.out.println("开始工作2");
        product.setComment2("工作2完成");
    }

    void fun3() {
        System.out.println("开始工作3");
        product.setComment3("工作3完成");
    }

    Product finalBuild() {
        return product;
    }
}
