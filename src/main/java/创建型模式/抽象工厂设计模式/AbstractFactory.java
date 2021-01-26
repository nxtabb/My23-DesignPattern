package 创建型模式.抽象工厂设计模式;

public abstract class AbstractFactory{
    public abstract Phone createPhone(String phoneName);
    public abstract Computer createComputer(String computerName);
}


