package StrategyPattern.stategyPattern;

import StrategyPattern.stategyPattern.driveStrategy.DriveStategy;

public class Vehicle {
    DriveStategy driveStategy;

    public Vehicle(DriveStategy driveStategy){
        this.driveStategy = driveStategy;
    }

    public void drive(){
        driveStategy.drive();
    }
}
