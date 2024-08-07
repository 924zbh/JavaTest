package ClassObject.Super;

public class SunWuKong extends Hero{

    public SunWuKong(){
        super("孙悟空");/*还原程序
        在子类构造第一行会调用父类的构造方法并且只能放在第一行
        并且如果父类构造方法含有参数也得补充参数因为默认的方法为super()无参数
        */
        System.out.println("我是子类的构造方法");
        /*在调用子类的构造方法时
        * 会先调用子类的方法在第一个行会调用父类的构造*/
    }
    String name = "孙悟空";
    public void chi(){
        System.out.println(super.name);
        System.out.println(this.name+"在吃桃子");
    }

    public static void main(String[] args) {
        SunWuKong s = new SunWuKong();
        s.chi();
    }
}
