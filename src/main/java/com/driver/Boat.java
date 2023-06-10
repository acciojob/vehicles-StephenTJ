package com.driver;

public class Boat extends Vehicle implements WaterVehicle{
    int capacity;

    public Boat(String name) {
        super(name);
    }

    public String getVehicleName(){
        return this.name;
    }
    public int getVehicleCapacity(){
        return capacity;
    }
}
