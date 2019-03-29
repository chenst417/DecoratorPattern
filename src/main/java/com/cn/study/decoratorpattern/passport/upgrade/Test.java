package com.cn.study.decoratorpattern.passport.upgrade;

import com.cn.study.decoratorpattern.passport.old.SiginService;

public class Test {
    public static void main(String[] args) {
        ISigninForThirdService service = new SigninForThirdService(new SiginService());
        service.loginForQQ("adasdaawqe");
    }

}
