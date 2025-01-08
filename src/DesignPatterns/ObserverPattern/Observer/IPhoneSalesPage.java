package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class IPhoneSalesPage implements NotificationAlertObserver {

    StockObservable iPhoneStockObservable;

    // NOTE: Constructor injection again
    // similar to the usage in strategy design pattern...
    IPhoneSalesPage(StockObservable stockObservable) {
        iPhoneStockObservable = stockObservable;
    }

    @Override
    public void receiveUpdateFromObservable() {
        // this method is called by the Observable
        // whenever the quantity is changed
        // so we check the quantity here and
        // take decision accordingly
        int quantity = iPhoneStockObservable.getQuantityInStock();

        // THIS CAN ALSO BE TWEAKED TO IMPLEMENT A LOGIC TO
        // NOTIFY "Subscribed users"
        // IF AN ITEM OUT OF STOCK EARLIER IS NOW BACK IN STOCK
        if (quantity > 0) {
            System.out.println(quantity + " Items Left");
        } else {
            System.out.println("Out of Stock");
        }

    }
}
