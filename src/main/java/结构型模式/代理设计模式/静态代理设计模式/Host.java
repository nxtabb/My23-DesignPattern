package 结构型模式.代理设计模式.静态代理设计模式;

public class Host implements Rent{
    public void rent() {
        System.out.println("房子终于租出去了");
    }
}
