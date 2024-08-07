package ClassObject.Practice2;

public abstract class AbstractDao implements IDAO{
    //void  connect();
    public void add() {
        System.out.println("增加");
    }
    public void del() {
        System.out.println("删除");
    }

    public void upd() {
        System.out.println("修改");
    }

    public void sel() {
        System.out.println("查询");
    }
}
