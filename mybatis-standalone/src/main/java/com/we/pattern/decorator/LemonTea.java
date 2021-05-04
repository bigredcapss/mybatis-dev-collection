package com.we.pattern.decorator;

public class LemonTea extends Drink{
    public LemonTea() {
        desc = "柠檬茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
