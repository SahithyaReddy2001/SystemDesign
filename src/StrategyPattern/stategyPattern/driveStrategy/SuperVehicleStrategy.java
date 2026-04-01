package StrategyPattern.stategyPattern.driveStrategy;

public class SuperVehicleStrategy implements DriveStategy{
    @Override
    public void drive() {
        System.out.println("FAST AND FURIOUS");
    }
}
