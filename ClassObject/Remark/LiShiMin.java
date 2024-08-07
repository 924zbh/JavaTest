package ClassObject.Remark;

public class LiShiMin extends LiYuan{
    public void makeCountry() {
        super.makeCountry();//super可以调用父类中被重写的方法
        //半盖
        System.out.println("李世民也想建立一个自己的国家");//方法的重写
    }

    public static void main(String[] args) {
        LiShiMin lsm = new LiShiMin();
        lsm.makeCountry();
    }
}
