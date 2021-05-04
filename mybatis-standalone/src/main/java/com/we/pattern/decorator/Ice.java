package com.we.pattern.decorator;

/**
 * 加冰块0.5元
 * @author BigRedCaps
 * @date 2021/5/4 10:33
 */
public class Ice extends Condiment{

    private Drink drink;

    public Ice(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + "+冰";
    }

    @Override
    public double cost() {
        return 0.5 + drink.cost();
    }

}