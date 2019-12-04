package org.fasttrackit;

public class Mechanic
{
    public void repairVehicle(Vehicle vehicle)
    {
        System.out.println("Repairing Vehicle "+vehicle.getName() );
        vehicle.setTraveledDistance(0);
    }
}
