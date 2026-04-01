package StrategyPattern.stategyPattern;

import StrategyPattern.stategyPattern.driveStrategy.GeneralVehiclesStrategy;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(){
        super(new GeneralVehiclesStrategy());
    }
}
