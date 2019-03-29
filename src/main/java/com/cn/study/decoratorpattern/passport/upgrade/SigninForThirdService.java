package com.cn.study.decoratorpattern.passport.upgrade;

import com.cn.study.decoratorpattern.passport.old.ISiginService;
import com.cn.study.decoratorpattern.passport.old.ResultMsg;

public class SigninForThirdService implements ISigninForThirdService {
    private ISiginService iSiginService;

    public SigninForThirdService(ISiginService iSiginService) {
        this.iSiginService = iSiginService;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForWeChat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelPhone(String tel, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return this.iSiginService.regist(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.iSiginService.login(username, password);
    }
}
