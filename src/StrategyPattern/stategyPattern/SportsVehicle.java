package StrategyPattern.stategyPattern;

import StrategyPattern.stategyPattern.driveStrategy.SuperVehicleStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SuperVehicleStrategy());
    }
}
