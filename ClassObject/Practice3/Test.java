package ClassObject.Practice3;

public class Test {

    public static void main(String[] args) {
        Animal ani1 = new Cat();
        Animal ani2 = new Dog();

        Valuable v = new Cat();

        Protect d = new Dog();

        ani2.eat();
        ani1.eat();
        d.hide();
        v.getMoney();

    }


}
