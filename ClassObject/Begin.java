package ClassObject;

public class Begin {
    //成员变量
    String color;
    int speed;
    int seat = 5;

    //成员方法
    public void run(){
        System.out.println("车能跑");
    }

    public static void main(String[] args) {
        //创建对象
        Begin c = new Begin();
        Begin c1 = new Begin();

        c.run();
        c.seat = 10;
        System.out.println(c.seat);
        System.out.println(c1.seat);
    }
}
