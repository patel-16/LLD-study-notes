package DesignPatterns.Decorator.Proper.Toppings;

import DesignPatterns.Decorator.Proper.BasePizza;
import DesignPatterns.Decorator.Proper.ToppingDecorator;

public class ExtraJalapeno extends ToppingDecorator {

    final int jalapenoCost = 20;

    // constructor injection again
    public ExtraJalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + jalapenoCost;
    }
}
