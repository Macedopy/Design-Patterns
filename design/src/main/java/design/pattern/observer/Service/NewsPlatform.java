package design.pattern.observer.Service;

public class NewsPlatform implements BitcoinPriceObserver
{
    @Override
    public void update(double price)
    {
        System.out.println("News Platform: New Bitcoin Price: " + price);
    }

}
