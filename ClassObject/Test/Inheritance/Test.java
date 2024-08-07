package ClassObject.Test.Inheritance;

public class Test {
    public static void main(String[] args) {
        HunDun hd = new HunDun();
        hd.name = "混沌";
        System.out.println(hd.name);

        hd.pian();
        hd.ChiRen();
//        hd.pasi();  private不能继承

    }
}
