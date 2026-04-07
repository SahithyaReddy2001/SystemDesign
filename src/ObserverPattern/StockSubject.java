package ObserverPattern;

public interface StockSubject {
    public void updateStockPrice(double stockPrice);
    public void userRegister(Observer observer);
}
