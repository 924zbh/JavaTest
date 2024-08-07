package ClassObject.Practice2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("请问您要链接哪个数据库(1:mysql ,2:oracle):");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        IDAO dao;
        if (n == 1) {
            dao = new MySqlDao();
        } else {
            dao = new OracleDao();
        }
        dao.connect();
        dao.add();
        dao.del();
        dao.upd();
        dao.sel();





    }
}
