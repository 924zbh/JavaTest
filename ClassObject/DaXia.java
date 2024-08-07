package ClassObject;

public class DaXia {
    String name;
    String waihao;
    int age;
    String bangpai;
//构造方法的重载：名字相同参数个数不同，顺序不同
    public DaXia(String name,int age,String waihao) {
        this.name = name;
        this.age =age;
        this.waihao = waihao;

    }
    public DaXia(String name,int age,String bangpai,String waihao) {
        this(name,age,waihao);// this 还能调用当前类中其他的构造方法。
        this.bangpai = bangpai;
    }

    public static void main(String[] args) {
//        lxy
        DaXia dx1 = new DaXia("lxy",19,"baby");
//        zbh
        DaXia dx2 = new DaXia("zbh",19,"couple","baby");
        System.out.println(dx2);



    }
}
