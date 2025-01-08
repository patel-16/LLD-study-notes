package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

// Observable -> producer/source of information
public interface StockObservable {

    public void addObserver(NotificationAlertObserver observer);

    public void removeObserver(NotificationAlertObserver observer);

    public void notifyObservers();

    public void setStockCount(int newQuantity);

    public int getQuantityInStock();

}
