package design.pattern.observer.Service;

public class BinancePriceLogger implements BitcoinPriceObserver
{
    @Override
    public void update(double price)
    {
        System.out.println("Binance Price Logger: New Bitcoin Price: " + price);
    }

}
