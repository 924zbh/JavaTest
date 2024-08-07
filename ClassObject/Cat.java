package ClassObject;

public class Cat {
    String name;
    String color;
    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    public boolean equals(Cat c) {   //可以自己写判断的逻辑
        if (this.color == c.color) {   //方法的重构
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Cat c1 = new Cat("刘贤雅","蓝色");
        Cat c2 = new Cat("刘贤雅","蓝色");
//        System.out.println(c1 == c2); //false 默认判断两个对象的内存地址是否一致，一般用在基本数据类型上
//
        System.out.println(c1.equals(c2));//false默认调用Object提供的equals方法
    }
}
