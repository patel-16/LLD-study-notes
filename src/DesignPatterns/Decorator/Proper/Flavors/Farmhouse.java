package DesignPatterns.Decorator.Proper.Flavors;

import DesignPatterns.Decorator.Proper.BasePizza;

public class Farmhouse extends BasePizza {

    @Override
    public int cost() {
        return 100;
    }

}
