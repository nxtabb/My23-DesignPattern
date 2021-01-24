package 单例设计模式.饿汉式;

public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
