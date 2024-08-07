package ClassObject.Test;

import ClassObject.Persion;

public class Exam {
    public String pub = "public";
    private String pri = "private";
    String def = "fefault";
    protected String pro = "protected";
    public static void main(String[] args) {
        Exam p = new Exam();
        System.out.println(p.pub);
        System.out.println(p.pri);
        System.out.println(p.def);
        System.out.println(p.pro);
    }
}
