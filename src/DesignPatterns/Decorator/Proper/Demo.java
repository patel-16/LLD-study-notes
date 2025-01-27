package DesignPatterns.Decorator.Proper;

import DesignPatterns.Decorator.Proper.Flavors.Farmhouse;
import DesignPatterns.Decorator.Proper.Toppings.ExtraCheese;
import DesignPatterns.Decorator.Proper.Toppings.ExtraJalapeno;

public class Demo {

    //  this is the final outcome we desired
    // instead of creating class again and again
    // for a particular combination of toppings
    // we can simply apply toppings over and over as shown
    BasePizza cheeseJalapenoFarmhousePizza = new ExtraJalapeno(new ExtraCheese(new Farmhouse()));

    // note how recursively (here linear, but a cue maybe other types of recursion as well (DP also maybe ??))
    // it will add up the costs of the Base and its toppings along the way...

}
