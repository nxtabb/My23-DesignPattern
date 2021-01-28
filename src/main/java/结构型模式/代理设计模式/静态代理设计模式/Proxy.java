package 结构型模式.代理设计模式.静态代理设计模式;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        xuanchuan();
        kanfang();
        host.rent();
        hetong();
    }

    private void xuanchuan(){
        System.out.println("中介宣传");
    }
    private void hetong(){
        System.out.println("签合同");
    }
    private void kanfang(){
        System.out.println("看房");
    }
}
