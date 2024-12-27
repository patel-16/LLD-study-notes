package SolidLecture.SingleResponsibility;

public class InvoiceMultipleResponsibility {
    private Marker marker;
    private int quantity;

    public InvoiceMultipleResponsibility(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getInvoiceTotal() {
        // Reason#1 -> for change here
        // could be discounts and taxation etc.
        int price = this.quantity*this.marker.price;
        return price;
    }

    public void saveToDB() {
        // Reason#2
        // Here a reason for change could be
        // changes in DB config or change
        // to save to a file
    }

    public void invoice() {
        // Reason#3
        // Here a reason for change could be
        // changes in invoice printing logic
        // maybe some fancy Diwali design
    }
}
