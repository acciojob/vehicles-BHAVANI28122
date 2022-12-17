package com.driver;

public class Boat implements WaterVehicle{


    String a ;
    int b;
     public Boat (String name , int capacity){
         this.a = name;
         this.b = capacity;
     }
    @Override
    public String getVehicleName() {
        return a;
    }

    @Override
    public int getVehicleCapacity() {
        return b;
    }

}
