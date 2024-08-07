package ClassObject;

public class Hero {
    String name;
    String skill_q;
    String skill_w;
    String skill_e;
    String skill_r;
    public Hero(String name) {
        this.name = name;
    }
    public Hero(String name,String skill_q,String skill_w,String skill_e,String skill_r) {
        this(name);
        this.skill_q = skill_q;
        this.skill_w = skill_w;
        this.skill_e = skill_e;
        this.skill_r = skill_r;
    }
    public void fight() {
        System.out.println(name + "在杀敌");
    }
    public static void main(String[] args) {
        Hero h = new Hero("刘贤雅","撒娇","牵手","抱","哭");
        h.fight();
    }
}
