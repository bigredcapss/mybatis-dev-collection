package com.we.pattern.decorator;


/**
 * 饮料——抽象类
 * @author BigRedCaps
 * @date 2021/5/4 10:33
 */
public abstract class Drink {
    // 饮料名称
    protected String desc;

    public String getDesc() {
        return desc;
    }

    // 饮料价格
    public abstract double cost();
}
