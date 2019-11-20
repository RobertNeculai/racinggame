package org.fasttrackit;

/**
 * Hello world!
 *
 */
// one line

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );
        Car carReference = new Car();
        carReference.name = "Dacia";
        carReference.color = "Red";
        carReference.mileage=9.8;
        carReference.fuelLevel=60;
        carReference.doorCount=2;
        carReference.maxSpeed=200;
        carReference.running=false;
        Engine carEngine= new Engine();
        carEngine.manufacturer="Renault";
        carEngine.dissplacement=1.5;
        carReference.engine=carEngine;
        System.out.println("Engine Details:");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.dissplacement);
        Car car2= new Car();
        car2.name="BMW";
        car2.mileage=14;
        System.out.println("First car name: "+ carReference.name);
        System.out.println(carReference.running);
        System.out.println(carReference.doorCount);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.mileage);
        System.out.println(carReference.running);
        System.out.println("Second car name: "+ car2.name);
        System.out.println(car2.mileage);
        System.out.println(carReference.traveledDistance);
        Car car3=car2;
        car3.name="AUDI";
        //Car3 se leaga la obiectul car2 direct la referinta,nu copiaza proprietatile
//Car car4=null;
    }
}
