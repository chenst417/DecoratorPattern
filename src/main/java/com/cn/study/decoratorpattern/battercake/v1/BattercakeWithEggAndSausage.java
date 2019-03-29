package com.cn.study.decoratorpattern.battercake.v1;

public class BattercakeWithEggAndSausage extends  BattercakeWithEgg {

    protected String getMsg(){
        return super.getMsg() + " + 1根香肠";
    }

    protected int getPrice(){
        return super.getPrice() + 1;
    }

}
