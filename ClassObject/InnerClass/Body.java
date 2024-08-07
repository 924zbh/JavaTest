package ClassObject.InnerClass;

public class Body {
    public class Heart {
        public void beat() {
            System.out.println("心会跳");
            System.out.println("我叫：" + name);
        }
    }
    private String name;
    public void methodBody() {
        System.out.println("外部类方法");
        Heart heart = new Heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
