package ClassObject;
//成员变量一般用private，保护成员变量不被胡乱赋值
public class Persion {
    private String name;
    private int age;

//    setter  给成员变量赋值并保护
    public void setName(String name) {
        this.name = name;
    }
//    可以有效保护成员变量
    public void setAge(int age){
       if (age < 0){
           this.age = 0;
       } else {
           this.age = age;
       }
    }
//    getter  从成员变量中获取数值
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void chi() {
        System.out.println(this.name + "在吃东西");
    }
}
//右键--生成--getter and setter