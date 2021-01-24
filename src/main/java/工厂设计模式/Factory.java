package 工厂设计模式;

public class Factory {
    public Phone createPhone(String phoneName){
        if(phoneName.equals("iphone")){
            return new Iphone();
        }else if(phoneName.equals("huawei")){
            return new Huawei();
        }else {
            return null;
        }
    }
}
