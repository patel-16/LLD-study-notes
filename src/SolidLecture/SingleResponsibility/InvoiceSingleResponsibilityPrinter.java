package SolidLecture.SingleResponsibility;

public class InvoiceSingleResponsibilityPrinter {
    private InvoiceSingleResponsibilityMain invoice;

    public InvoiceSingleResponsibilityPrinter(InvoiceSingleResponsibilityMain invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // Reason#3
        // Here a reason for change could be
        // changes in invoice printing logic
        // maybe some fancy Diwali design
    }

}
