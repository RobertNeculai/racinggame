package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    public void start()
    {
        System.out.println("Starting Game ");
        int playerNumber=playerNumber();
        System.out.println("Number of players: "+playerNumber);
        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name for Car "+vehicleName);
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
