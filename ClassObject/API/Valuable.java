package ClassObject.API;
/**
 * 能继承接口的只能是接口
 * 接口和类只能是  “实现” 关系 implements
 * */
public interface Valuable {   //接口使用interface声明 ，已经不是类了

    public static int money = 100;
    int cash = 10; //前面默认加了public static

//    接口中所有方法都是抽象方法，所有内容都是公开的，所以public,abstract都可以省略
    void getMoney();   //接口中所有方法都是抽象方法不能有正常方法
}
