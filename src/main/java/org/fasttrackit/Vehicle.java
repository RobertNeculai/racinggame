package org.fasttrackit;


public class Vehicle {
    //Class Variable
    static int totalCount;
    String name, color;
    double mileage, maxSpeed, fuelLevel, traveledDistance;
    boolean running;

    public Vehicle() {
        totalCount++;
    }






public double accelerate(double speed,double durationInHours)
{
    System.out.println(name+ " is accelerating with " +speed + " km for "+durationInHours+" .h");
    double distance = speed*durationInHours;
    traveledDistance+=distance;
    double usedFuel=mileage*distance /100;
    fuelLevel-=usedFuel;
    System.out.println("Used fuel: " +usedFuel+ " Remaining Fuel: " +fuelLevel);
    System.out.println("Distance traveled: "+traveledDistance);
    return distance;
}
}
