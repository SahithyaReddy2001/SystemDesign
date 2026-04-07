package ObserverPattern;

public class Observer1 implements  Observer{
    @Override
    public void notifyStockPrice(double stockPrice) {
        System.out.println("Observer 1: stock price changed to " + stockPrice);
    }
}
