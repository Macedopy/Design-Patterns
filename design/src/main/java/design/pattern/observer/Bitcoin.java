package design.pattern.observer;

import java.util.List;

import design.pattern.observer.Service.BitcoinPriceObserver;

public class Bitcoin {
    private final double price;
    private List<BitcoinPriceObserver> observers;

    public Bitcoin(double price, List<BitcoinPriceObserver> observers) {
        this.price = 0.0;
        this.observers = null;
    }

    public void setPrice(double newPrice)
    {
        if (newPrice != this.price)
            {
                this.price = newPrice;

                this.notifyObervers();
            }
    }

    public double getPrice() {
        return price;
    }

    public void addObserver(BitcoinPriceObserver observer)
    {
        observers.add(observer);
    }

    private void notifyObervers()
    {
        for (BitcoinPriceObserver bitcoinPriceObserver : observers) {
            bitcoinPriceObserver.update(price);
        }
    }
}
