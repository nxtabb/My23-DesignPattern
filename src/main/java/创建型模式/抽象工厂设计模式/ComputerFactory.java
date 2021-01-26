package 创建型模式.抽象工厂设计模式;

public class ComputerFactory extends AbstractFactory {
    public Phone createPhone(String phoneName) {
        return null;
    }

    public Computer createComputer(String computerName) {
        if(computerName.equals("MacBookAir")){
            return new MacBookAir();
        }else if (computerName.equals("MacBookPro")){
            return new MacBookPro();
        }else if(computerName.equals("MateBook")){
            return new MateBook();
        }else {
            return null;
        }
    }
}
