package ClassObject;

public class This {
    String color = "蓝色";
    int speed;
    int seat;

    public void run(){
        //默认会有一个this：当前正在执行这个方法的对象
        System.out.println(this);
        System.out.println(this.color);
    }

    public void fly(String color){
//        变量的查找顺序：先找自己方法内的，如果自己没有就去this里找
        System.out.println(color + "的车在" + this.color + "的云里飞");
        System.out.println(this.color + "的车在飞");
    }

    public static void main(String[] args) {
        This c1 = new This();
        c1.color = "green";
        c1.speed = 180;
        System.out.println(c1);
        c1.run();

        This c2 = new This();

//        this可以帮我们区分成员变量和局部变量
        c1.fly("blue");
        c2.fly("yellow");
    }
}
