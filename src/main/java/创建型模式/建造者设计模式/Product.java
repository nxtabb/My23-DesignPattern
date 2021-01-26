package 创建型模式.建造者设计模式;

public class Product {
    private String comment1;
    private String comment2;
    private String comment3;

    public Product() {
    }

    public Product(String comment1, String comment2, String comment3) {
        this.comment1 = comment1;
        this.comment2 = comment2;
        this.comment3 = comment3;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "comment1='" + comment1 + '\'' +
                ", comment2='" + comment2 + '\'' +
                ", comment3='" + comment3 + '\'' +
                '}';
    }
}
