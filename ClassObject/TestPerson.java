package ClassObject;

public class TestPerson {
    public static void main(String[] args) {
        Persion p = new Persion();
//        p.name = "刘贤雅";
//        p.age = -1;
        p.setName("刘贤雅");
        p.setAge(-1);
        //查看人的名字
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.chi();
    }
}

