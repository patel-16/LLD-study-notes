package SolidLecture.SingleResponsibility;

public class InvoiceSingleResponsibilityMain {
    private Marker marker;
    private int quantity;

    public InvoiceSingleResponsibilityMain(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getInvoiceTotal() {
        // Reason#1 -> for change here
        // could be discounts and taxation etc.
        int price = this.quantity * this.marker.price;
        return price;
    }
}
