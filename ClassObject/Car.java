package ClassObject;

public class Car {
    //成员变量
    String color;
    int speed;
    int seat;



    public Car(String color) {
        //构造方法    最大作用：  在创建对象时，给对象设置属性信息
        this.color = color;

}
    public void fly(String color) {
        System.out.println(color + "的车在" + this.color +"的云里飞");//前者color先在对象里找，this则先在自己的方法里找

    }//加this.成员变量，不加为局部变量
    //成员方法
    public void run(String color) {
        System.out.println(color + "的车能跑");
    }
    public static void main(String[] args) {

        Car c = new Car("粉色");//创建对象
        c.run("蓝色");

        Car c2 = new Car("黄色");
//        c2.color = "黄色";
        c2.fly("黑色");//对象的color为黄色，方法的color为黑色
        //黑色为方法的color,黄色为对象的this.color
        Car c3 = new Car("紫色") ;
        c3.fly("灰白色");
        System.out.println();

    }

}
