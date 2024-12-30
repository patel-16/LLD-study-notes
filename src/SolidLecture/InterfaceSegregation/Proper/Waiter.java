package SolidLecture.InterfaceSegregation.Proper;

public class Waiter implements WaiterInterface {
    @Override
    public void takeOrder() {
        System.out.println("taking order");
    }

    @Override
    public void serveCustomer() {
        System.out.println("serving food to customer");
    }
}
