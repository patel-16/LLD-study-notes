package DesignPatterns.Decorator.Violation;

public class MargheritaPizzaExtraCheese {

    int baseCost;
    private int extraCheeseCost;

    public int cost() {
        return this.baseCost + this.extraCheeseCost;
    }
}
