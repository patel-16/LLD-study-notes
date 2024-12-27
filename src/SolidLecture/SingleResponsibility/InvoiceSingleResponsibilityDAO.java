package SolidLecture.SingleResponsibility;

public class InvoiceSingleResponsibilityDAO {
    private InvoiceSingleResponsibilityMain invoice;

    public InvoiceSingleResponsibilityDAO(InvoiceSingleResponsibilityMain invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Reason#2
        // Here a reason for change could be
        // changes in DB config or change
        // to save to a file
    }
}
