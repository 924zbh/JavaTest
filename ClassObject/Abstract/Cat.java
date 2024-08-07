package ClassObject.Abstract;

public class Cat extends Animal{
    public void eat(){     //抽象类的子类必须重写父类中的方法
        System.out.println("猫吃鱼");
    }
    public void move() {
        System.out.println("猫懒洋洋的动");//通过抽象类强制要求子类必须含有该方法
    }
}
