package StrategyPattern.stategyPattern;

import StrategyPattern.stategyPattern.driveStrategy.SuperVehicleStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SuperVehicleStrategy());
    }
}
