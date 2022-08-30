package com.elong.main;

import com.elong.login.Login;
import com.google.gson.Gson;

public class Main {


    private static final Login login = new Login();


    public static void main(String[] args) {

        // 获取验证码
        String code = login.getVerify("13712112449");
        // 提交验证码
        String verifyResult = login.submitVerify(code);





        Gson gson = login.login(null);
        System.out.println(gson.toString());
    }
}
