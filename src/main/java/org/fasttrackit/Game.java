package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private Track[] tracks= new Track[3];
    private List<Vehicle> competitors=new ArrayList<>();
    private void initializeCompetitors()
    {
        int playerNumber=playerNumber();
        System.out.println("Number of players: "+playerNumber);
        for(int i=1;i<=playerNumber;i++)
        {
            System.out.println("Adding player "+i);
            Vehicle vehicle=new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6,15));
            vehicle.setMaxSpeed(300);
            System.out.println("Vehicle for Player "+i+" is : "+vehicle.getName()+" with: "+vehicle.getMileage()+" mileage");
            competitors.add(vehicle);
        }

    }


    public void start() {
        initializeTracks();
        displayTracks();
        System.out.println("Starting Game ");
        initializeCompetitors();
        for (Vehicle vehicle : competitors)
        {
            System.out.println("It's " + vehicle.getName() + "'s turn");
    }
    }
    private void initializeTracks()
    {
        Track track1=new Track();
        track1.setName("SilverStone");
        track1.setLenght(4.2);
        tracks[0]=track1;
        Track track2=new Track();
        track2.setName("Nurburgring");
        track2.setLenght(21.2);
        tracks[1]=track2;
    }
    private void displayTracks(){
        System.out.println("Available Tracks: ");
        //Clasic for loop
        for(int i=0;i<tracks.length;i++) {
            if (tracks[i] != null)
                System.out.println((i+1) + ". " + tracks[i].getName() + " - " + tracks[i].getLenght()+"km");
        }
    }
    private String getVehicleNameFromUser()
    {
        System.out.println("Please Enter Vehicle Name: ");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
    private int playerNumber()
    {
        System.out.println("Please Enter PLayer Number: ");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
