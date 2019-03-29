package com.cn.study.decoratorpattern.passport.upgrade;

import com.cn.study.decoratorpattern.passport.old.ISiginService;
import com.cn.study.decoratorpattern.passport.old.ResultMsg;

public interface ISigninForThirdService extends ISiginService {
    /**
     * QQ登录
     * @param openId
     * @return
     */
    ResultMsg loginForQQ(String openId);

    /**
     * 微信登录
     * @param openId
     * @return
     */
    ResultMsg loginForWeChat(String openId);

    /**
     * token登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机登录
     * @param tel
     * @param code
     * @return
     */
    ResultMsg loginForTelPhone(String tel, String code);

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    ResultMsg loginForRegist(String username, String password);

}
