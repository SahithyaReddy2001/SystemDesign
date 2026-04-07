package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockSubjectImpl implements StockSubject{
    public static List<Observer> observers = new ArrayList<>();
    @Override
    public void updateStockPrice(double stockPrice) {
        observers.forEach(o -> o.notifyStockPrice(stockPrice));
    }

    @Override
    public void userRegister(Observer observer) {
        System.out.println("Adding new User");
        observers.add(observer);
    }
}
