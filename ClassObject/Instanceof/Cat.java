package ClassObject.Instanceof;

public class Cat extends Animal{

    public static void main(String[] args) {

        Animal ani = new Animal();

        if (ani instanceof Cat) { //可以判断某某对象是否是某某类型的
            //判断ani是否是猫类型的
            System.out.println("是一只猫，撸一撸");
        } else {
            System.out.println("不是一只猫");
        }


    }

}
