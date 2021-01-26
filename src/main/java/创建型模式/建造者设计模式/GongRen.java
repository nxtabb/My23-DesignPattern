package 创建型模式.建造者设计模式;

public class GongRen extends Builder{
    Product product;
    public GongRen(){
        product = new Product();
    }
    void fun1() {
        System.out.println("我不想干");
        product.setComment1("wobugan");
    }

    void fun2() {
        System.out.println("我不想干");
        product.setComment2("wobugan");
    }

    void fun3() {
        System.out.println("我不想干");
        product.setComment3("wobugan");
    }

    Product finalBuild() {
        return product;
    }
}
