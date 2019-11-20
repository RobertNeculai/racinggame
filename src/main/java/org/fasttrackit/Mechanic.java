package org.fasttrackit;

public class Mechanic
{
    public void repairVehicle(Vehicle vehicle)
    {
        System.out.println("Repairing Vehicle "+vehicle.name );
        vehicle.traveledDistance=0;
    }
}
