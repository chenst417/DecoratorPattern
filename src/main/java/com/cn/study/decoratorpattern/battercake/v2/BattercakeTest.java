package com.cn.study.decoratorpattern.battercake.v2;

public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());

        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg() + ",总价格" + battercake.getPrice());

    }
}
