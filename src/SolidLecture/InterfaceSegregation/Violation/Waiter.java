package SolidLecture.InterfaceSegregation.Violation;

// Here only takeOrder() is a useful
// function of waiter, others are not required
// but because of the RestaurantWorker interface,
// it had to implement other un-necessary methods
// Thus this RestaurantWorker interface should
// be "segregated"/ segmented into smaller interfaces to
// make the design compliant with InterfaceSegregation principle
// (can be checked in Proper subdirectory of InterfaceSegregation package)
public class Waiter implements RestaurantWorker {
    @Override
    public void washDishes() {
        // no use for waiter
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order");
    }

    @Override
    public void cookFood() {
        // no use for waiter
    }
}
