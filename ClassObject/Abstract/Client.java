package ClassObject.Abstract;

public class Client {
    public static void main(String[] args) {
        Animal c = new Cat();   //多态性
        c.eat();
        c.move();
        c.smell();
//        Animal ani = new Animal();   抽象类不能创造对象
    }
}
