package 结构型模式.适配器设计模式.接口适配器设计模式;

public abstract class AbstractSource implements Source {
    public void editTextFile01() {
        //pass
        System.out.println("editTextFile01 origin");
    }

    public void editTextFile02() {
        //pass
        System.out.println("editTextFile02 origin");
    }
}
