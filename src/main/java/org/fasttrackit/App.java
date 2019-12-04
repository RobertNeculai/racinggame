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
        Game game1=new Game();
        game1.start();

//        Car carWithDefaultEngine=new Car();
//        Engine carEngine= new Engine();
//        carEngine.manufacturer="Renault";
//        carEngine.dissplacement=1.5;
//        Car carReference = new Car(carEngine);
//        carReference.setName("Dacia");
//        carReference.setColor("Red");
//        carReference.setMileage(9.8);
//        carReference.setFuelLevel(60);
//        carReference.setMaxSpeed(200);
//        carReference.doorCount=2;
//        carReference.setRunning(false);
//        System.out.println("Engine Details:");
//        System.out.println(carReference.engine.manufacturer);
//        System.out.println(carReference.engine.dissplacement);
//        double accelerationDistance=carReference.accelerate(130,1);
//        System.out.println("Acceleration distance: "+accelerationDistance);
//        Mechanic mec1=new Mechanic();
//        mec1.repairVehicle(carReference);
//        System.out.println(carReference.getTraveledDistance());
//        Car car2= new Car(carEngine);
//        car2.setName("BMW");
//        car2.setMileage(14);
//        System.out.println("First car name: "+ carReference.getName());
//        System.out.println(carReference.isRunning());
//        System.out.println(carReference.doorCount);
//        System.out.println(carReference.getFuelLevel());
//        System.out.println(carReference.getMaxSpeed());
//        System.out.println(carReference.getMileage());
//        System.out.println(carReference.isRunning());
//        System.out.println("Second car name: "+ car2.getName());
//        System.out.println(car2.getMileage());
//        System.out.println(carReference.getTraveledDistance());
//        Car car3=car2;
//        car3.setName("Audi");
//        System.out.println(carReference);
//        //Car3 se leaga la obiectul car2 direct la referinta,nu copiaza proprietatile
////        Modulo = restul impartirii , operator %
////Car car4=null;
////Class variables
//        System.out.println("Studying class variables (static variables)");
//        Vehicle vehicle1=new Vehicle();
//        vehicle1.totalCount=10;
//        Vehicle vehicle2=new Vehicle();
//        vehicle2.totalCount=20;
//        Vehicle.totalCount=30;
//        System.out.println(vehicle1.totalCount);
//        //Method implementation taken from object's class not from variable class;
//        //Vehicle ch1=new JokerVehicle();
//        Vehicle ch1=new JokerVehicle();
//        ch1.setName("Furrari");
//        ch1.setFuelLevel(100);
//        ch1.accelerate(200,1);
//        System.out.println("Joker total distance:"+ch1.getTraveledDistance());
//        //Type-Casting
//        ((JokerVehicle)ch1).fly();
//        //Variables class determins Invocable Methods;
 }
}
