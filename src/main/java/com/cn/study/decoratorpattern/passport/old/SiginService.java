package com.cn.study.decoratorpattern.passport.old;

/**
 * 注册登录服务
 */
public class SiginService implements ISiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return new ResultMsg(200,"注册成功！", new Member());
    }

    /**
     * 登录成功
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password){
        return new ResultMsg(200,"登录成功！", new Member());
    }

}
