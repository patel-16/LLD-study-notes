package SolidLecture.OpenClosedPrinciple.Violation;

import SolidLecture.SingleResponsibility.InvoiceSingleResponsibilityMain;

public class InvoiceDAO {
    private InvoiceSingleResponsibilityMain invoice;

    public InvoiceDAO(InvoiceSingleResponsibilityMain invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {

    }

    // Assume, reading top to bottom, code is TESTED TILL HERE
    // and also taking in LIVE CUSTOMER TRAFFIC

    // Let us say we got a new requirement of adding a
    // new functionality to "add a method to save to a File"
    // in addition to the existing method of saving to DB

    // adding the following method to save to a file
    // in this existing class is a violation
    // of Open/Closed principle
    // since Open to Extension/ Closed to Modification implies
    // it is preferred for a functionality/requirement
    // to be accommodated through inheritance/extension of interface
    // rather than modifying a TESTED AND LIVE FILE

    // new code, not preferred due to reason described above
    // Proper code can be checked in the Proper Package of OpenClosedPrinciple
    public void saveToFile() {

    }

}
