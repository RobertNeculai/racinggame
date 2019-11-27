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
    double mileageMultiplier=1;
    System.out.println(name+ " is accelerating with " +speed + " km for "+durationInHours+" .h");
    if(speed>maxSpeed) {
        System.out.println("Max speed excedeed");
        return 0;
    }
    else if(speed==maxSpeed) {
        System.out.println("Carefull! Max speed reached");
    }
    else {
        System.out.println("Valid speed entered");
    }
    if(fuelLevel<=0) {
        System.out.println("Not enough Fuel");
        return 0;
    }
    if(speed>120)
    {
        //Incresing milleageMultiplier with speed increase
        mileageMultiplier=speed/100;
        System.out.println("More fuel will be used");
    }
    double distance = speed*durationInHours;
    traveledDistance+=distance;
    double usedFuelWithStandardMileage=mileage*distance /100;
    fuelLevel-=usedFuelWithStandardMileage*mileageMultiplier;
    System.out.println("Used fuel: " +usedFuelWithStandardMileage+ " Remaining Fuel: " +fuelLevel);
    System.out.println("Distance traveled: "+traveledDistance);
    return distance;
}
}
