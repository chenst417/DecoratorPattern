package com.cn.study.decoratorpattern.battercake.v1;

public class BattercakeWithEgg extends  Battercake {

    protected String getMsg(){
        return super.getMsg() + " + 1个鸡蛋";
    }

    protected int getPrice(){
        return super.getPrice() + 1;
    }

}
