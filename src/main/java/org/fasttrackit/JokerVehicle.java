package org.fasttrackit;

public class JokerVehicle extends Vehicle {
    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName()+ " is accelerating with " +speed + " km for "+durationInHours+" .h");
        double distance=2*speed*durationInHours;
        setTraveledDistance(getTraveledDistance()+distance);
        System.out.println("Cheating ! Beware Ban Incoming");
        return distance;
    }
}
