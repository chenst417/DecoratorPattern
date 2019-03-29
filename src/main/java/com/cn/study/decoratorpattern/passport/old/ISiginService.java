package com.cn.study.decoratorpattern.passport.old;

public interface ISiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg regist(String username, String password);

    /**
     * 登录成功
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);

}
