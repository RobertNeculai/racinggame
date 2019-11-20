package org.fasttrackit;

public class AutoVehicle extends Vehicle
{
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Creating an Auto-Vehicle: ");
    }
}
