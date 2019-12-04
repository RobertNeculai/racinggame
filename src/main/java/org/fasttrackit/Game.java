package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    private Track[] tracks= new Track[3];

    public void start()
    {
        initializeTracks();
        displayTracks();
        System.out.println("Starting Game ");
        int playerNumber=playerNumber();
        System.out.println("Number of players: "+playerNumber);
        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name for Car "+vehicleName);
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
