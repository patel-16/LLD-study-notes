package SolidLecture.SingleResponsibility;

public class InvoiceMultipleResponsibility {
    private Marker marker;
    private int quantity;

    public InvoiceMultipleResponsibility(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Here there appear to be at least 3 (P.O# umbrella)
    // responsibility/reasons for
    // changes in this class,
    // thus single (umbrella) reason for change is not followed
    // also this class appears to have 3 responsibilities:
    // 1. generate final printInvoice data
    // 2. print printInvoice data
    // 3. save printInvoice data to DB...

    // Thus it is broken in to 3 classes as demonstrated by other 3
    // classes of this package

    public int getInvoiceTotal() {
        // Reason#1 -> for change here
        // could be discounts and taxation etc.
        int price = this.quantity * this.marker.price;
        return price;
    }

    public void saveToDB() {
        // Reason#2
        // Here a reason for change could be
        // changes in DB config or change
        // to save to a file
    }

    public void printInvoice() {
        // Reason#3
        // Here a reason for change could be
        // changes in invoice printing logic
        // maybe some fancy Diwali design
    }
}
