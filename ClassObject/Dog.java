package ClassObject;

public class Dog {
    String name;
    String color;

    public Dog(String name,String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog d = new Dog("刘贤雅","蓝色");
//      直接打印c
        System.out.println(d);
//      默认打印对象，自动执行这个对象的toString()方法
        System.out.println(d.toString());
//      默认的toString() -> 包名 + 类名 + @内存地址
    }
}
