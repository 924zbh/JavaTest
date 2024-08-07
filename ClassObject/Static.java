package ClassObject;
public class Static {
//先执行静态，再执行通用，最后构造方法
    {
        System.out.println("这个是通用构造器");
    }

    static {
        System.out.println("这个是静态构造器");
    }

    public Static() {
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        new Static();
    }//因为创建对象的过程在静态内容之后，所以静态方法不能使用this因为this是对象
}




