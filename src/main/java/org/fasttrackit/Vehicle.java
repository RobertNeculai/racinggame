package org.fasttrackit;


import java.util.StringJoiner;

public class Vehicle {
    //Class Variable
    static int totalCount;
private String name, color;
private double mileage, maxSpeed, fuelLevel, traveledDistance;
private boolean running;

    public Vehicle() {
        totalCount++;
    }
    //Method Overloaded
    public double accelerate(double speed)
    {
        return accelerate(speed,1);
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
    System.out.println("Distance traveled: "+traveledDistance+" km");
    return distance;
}
//Co-variant return type;
@Override
public Vehicle clone(){
        return new Vehicle();
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vehicle.class.getSimpleName() + "", "")
                .add("name='" + name + "'")
                .add("color='" + color + "'")
                .add("mileage=" + mileage)
                .add("maxSpeed=" + maxSpeed)
                .add("fuelLevel=" + fuelLevel)
                .add("traveledDistance=" + traveledDistance)
                .add("running=" + running)
                .toString();
    }
}
