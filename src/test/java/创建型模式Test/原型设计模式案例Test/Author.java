package 创建型模式Test.原型设计模式案例Test;

import 创建型模式.原型设计模式.Video;

import java.util.Date;

public class Author {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Video v1 = new Video("你心疼","hahaha",new Date());
        Video v2 = (Video)v1.clone();
        v1.setName("aa");
        v1.setCreateTime(new Date());
        System.out.println(v1);
        System.out.println(v2);
    }
}
