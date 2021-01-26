package 创建型模式.建造者设计模式;

public class Commander {
    public Product command(Builder builder){
        builder.fun1();
        builder.fun2();
        builder.fun3();
        return builder.finalBuild();
    }
}
