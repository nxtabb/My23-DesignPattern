package 创建型模式.单例设计模式.双重校验锁;
//懒汉式双重校验锁
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton doubleLockSingleton;
    private DoubleLockSingleton(){}
    public static DoubleLockSingleton getInstance(){
        if(doubleLockSingleton==null){
            synchronized (DoubleLockSingleton.class){
                if(doubleLockSingleton==null){
                    doubleLockSingleton = new DoubleLockSingleton();
                    return doubleLockSingleton;
                }
            }
        }
        return doubleLockSingleton;
    }
}
