package 创建型模式.原型设计模式;

import java.util.Date;

//构造一个待复制的视频
public class  Video implements Cloneable {
    private String name;
    private String content;
    private Date createTime;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Video v = (Video)obj;
        v.createTime = (Date) v.createTime.clone();
        return obj;
    }

    public Video(){}

    public Video(String name, String content, Date createTime) throws InterruptedException {
        System.out.println("开始制作视频");
        Thread.sleep(5000);
        this.name = name;
        this.content = content;
        this.createTime = createTime;
        System.out.println("视频制作完毕");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
