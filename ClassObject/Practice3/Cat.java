package ClassObject.Practice3;

public class Cat extends Animal implements Valuable,Protect{

    public void eat() {
        System.out.println("刘贤雅喜欢吃自己");
    }
    public void getMoney() {
        System.out.println("刘贤雅不可以换钱");
    }
    public void hide() {
        System.out.println("把猫藏起来");
    }


}
