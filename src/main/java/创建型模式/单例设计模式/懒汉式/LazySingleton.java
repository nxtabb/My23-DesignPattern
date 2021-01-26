package 创建型模式.单例设计模式.懒汉式;
//懒汉式单例设计模式
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
