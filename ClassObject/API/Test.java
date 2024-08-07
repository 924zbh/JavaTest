package ClassObject.API;

public class Test {
    public static void main(String[] args) {
//        Gold g = new Gold();
//        Valuable h = new Gold(); //接口一样具有多态性
//        g.getMoney();
//        h.getMoney();

        Panda p = new Panda();
        Animal ani = new Animal();
        Valuable v = new Panda();
        Protectable pro = new Panda();

//        p.eat();
//        p.hide();
//        p.getMoney();
        ani.eat();
//        ani.hide();  //animal 只有eat方法
        pro.hide();

//        Valuable.money = 10;  //报错因为money是全局静态常量
        System.out.println(Valuable.money);

    }
}
