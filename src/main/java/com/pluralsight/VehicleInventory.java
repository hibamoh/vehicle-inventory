package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;



public class VehicleInventory {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // create a new array list filled with vehicle objects

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Vehicle car = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles.add(car);

        vehicles.add(new Vehicle(101122,"Toyota Camry","Blue",60000,11000));
        vehicles.add(new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700));
        vehicles.add(new Vehicle(101124,"Honda Civic","White",70000,7500));
        vehicles.add(new Vehicle(101125,"Subaru Outback","Green",55000,14500));
        vehicles.add(new Vehicle(  101126,"Jeep Wrangler","Yellow",30000,16000));

        String displayPrompt = """
                what do you want to do?
                1  - list all the vehicles
                2  - search by make/model
                3  - search by price range
                4  - search by color
                5  - add a vehicle
                6  - quit
                enter your command: 
                """;

        System.out.println(displayPrompt);

        String userInput = myScanner.nextLine();

        switch (userInput){

            case"1" -> {
                listAllTheVehicles(vehicles);

            }

        }



    }

    private static void listAllTheVehicles (ArrayList<Vehicle> vehicles){
        System.out.println("vehicle inventory");

        for (Vehicle v : vehicles){
            System.out.println("ID: " + v.getVehicleid());
            System.out.println("Make/Model: " + v.getMakeModel());
            System.out.println("Color: " + v.getColor());
            System.out.println("Odometer: " + v.getOdometerReading());
            System.out.println("Price: $" + v.getPrice());
            System.out.println("-------------------------");

        }
    }
}
