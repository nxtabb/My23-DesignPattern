package 抽象工厂设计模式;

public class PhoneFactory extends AbstractFactory {
    public Phone createPhone(String phoneName) {
        if(phoneName.equals("iphoneX")){
            return new IphoneX();
        }else if(phoneName.equals("iphoneXs")){
            return new IphoneXs();
        }else if(phoneName.equals("huaWeiP20")){
            return new HuaweiP20();
        }else if(phoneName.equals("huaWeiP30")){
            return new HuaweiP30();
        }else {
            return null;
        }
    }

    public Computer createComputer(String computerName) {
        return null;
    }
}
