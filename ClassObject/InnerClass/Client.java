package ClassObject.InnerClass;

public class Client {
    /*
    *如何使用成员内部类？有两种方法
    * 1.简介方法： 在外部类的方法中，使用内部类对象
    * 2.直接方法：公式外部类名称.内部类名称 对象名 = new 外部类名称（）.内部类名称（）；
    * */
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();

//        Body.Heart heart = new Body().Heart();
    }
}
