package design.pattern.observer.Service;

public class InvestorNotifier implements BitcoinPriceObserver
{
    @Override
    public void update(double price)
    {
        System.out.println("Investor Notifier: New Bitcoin Price: " + price);
    }

}
