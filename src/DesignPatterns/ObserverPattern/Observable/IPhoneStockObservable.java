package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.List;

// producer/source of info for Mobile stock
public class IPhoneStockObservable implements StockObservable {

    List<NotificationAlertObserver> observerList;

    int quantityInStock;

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.receiveUpdateFromObservable();
        }
    }

    @Override
    public void setStockCount(int newQuantity) {
        quantityInStock = newQuantity;
        notifyObservers();
    }

    @Override
    public int getQuantityInStock() {
        return quantityInStock;
    }
}
