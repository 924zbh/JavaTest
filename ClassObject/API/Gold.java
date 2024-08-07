package ClassObject.API;

public class Gold implements Valuable{
//    因为是接口所以要 “实现” (重写) 抽象方法
    public void getMoney() {
        System.out.println("黄金可以换钱");
    }
}
