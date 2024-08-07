package ClassObject.Test;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123";

        Scanner scn = new Scanner(System.in);
        System.out.println("请输入用户名 :");
        String uname = scn.nextLine();

        System.out.println("请输入密码： ");
        String upwd = scn.nextLine();
//字符串判断一定要用equals
//        判断用户名与密码
        if (uname.equals(username) && upwd.equals(password)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
