package com.driver;

public class Boat implements WaterVehicle{


    String a ;
    int b;
    @Override
    public String getVehicleName() {
        this.a = a;
        return a;
    }

    @Override
    public int getVehicleCapacity() {
        this.b = b;
        return b;
    }

}
