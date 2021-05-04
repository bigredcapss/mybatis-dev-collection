package com.we.pattern.decorator;

/**
 * 加糖一元
 * @author BigRedCaps
 * @date 2021/5/4 10:33
 */
public class Sugar extends Condiment {
    private Drink drink;

    public Sugar(Drink drink) {
        this.drink = drink;
    }

    public String getDesc() {
        return drink.getDesc() + "+糖";
    }

    public double cost() {
        return 1 + drink.cost();
    }
}
