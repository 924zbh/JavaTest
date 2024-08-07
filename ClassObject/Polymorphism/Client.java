package ClassObject.Polymorphism;

public class Client {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        Cat c = new Cat();
//        Person p = new Person();
//        p.feedCat(c);
//        p.feedDog(d);


        Animal ani1 = new Cat();//把子类的对象赋值给父类的引用(变量) 向上转型
        Animal ani2 = new Dog();
        Animal ani3 = new Elephant();
        Animal ani4 = new Rabbit();
//        ani1.catchMouse();向上转型会屏蔽子类中特有的方法
        Person p = new Person();
        p.feed(ani1);
        p.feed(ani2);
        p.feed(ani3);
        p.feed(ani4);
        //多态： 把不同的数据类型统一
//      向下转型：
        Cat cc = (Cat) ani1;
        cc.catchMouse();
    }
}
