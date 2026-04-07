import ObserverPattern.Observer1;
import ObserverPattern.StockSubject;
import ObserverPattern.StockSubjectImpl;
import StrategyPattern.stategyPattern.NormalVehicle;
import StrategyPattern.stategyPattern.OffRoadVehicle;
import StrategyPattern.stategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        StockSubject stockSubject = new StockSubjectImpl();
        stockSubject.userRegister(new Observer1());
        stockSubject.userRegister(new Observer1());
        stockSubject.userRegister(new Observer1());
        stockSubject.updateStockPrice(5.0);
    }
}