package org.fasttrackit;

public class Car extends AutoVehicle
    //inheritence
{
    // Instance Variables

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    public Car() {
        this(new Engine());
        //Constructor Overloading
    }
}