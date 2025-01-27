package DesignPatterns.Decorator.Violation;

// here for each customization of Pizza we need to add a new
// class, which is not desirable since this will lead to a huge number of
// classes
// (also known as class explosion problem)
public class MargheritaPizza {

    int cost;

    public int cost() {
        return this.cost;
    }

}
