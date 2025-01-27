package DesignPatterns.Decorator.Proper.Toppings;

import DesignPatterns.Decorator.Proper.BasePizza;
import DesignPatterns.Decorator.Proper.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {

    final int cheeseCost = 10;

    // constructor injection again
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + cheeseCost;
    }
}
