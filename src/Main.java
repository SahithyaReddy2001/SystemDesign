import StrategyPattern.stategyPattern.NormalVehicle;
import StrategyPattern.stategyPattern.OffRoadVehicle;
import StrategyPattern.stategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new OffRoadVehicle();
        v.drive();
    }
}