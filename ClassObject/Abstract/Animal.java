package ClassObject.Abstract;

public abstract class Animal {
    //类中如果有抽象方法那么类也必须是抽象类
    public abstract void eat();  //抽象方法没有方法体，直接用分号结尾
    public abstract void move();
    public void smell(){
        System.out.println("我在闻"); //抽象类中可以有正常的方法
    }
}
