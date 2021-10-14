package com.softwareinstitute.training.azmi.jacob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("red","Ford","Fiesta","BK56EEP","4");
        Car car2 = new Car("blue","VW","Polo","BB50GGT","3");
        Car car3 = new Car("black","VW","Golf","CB15RPD","4");
        Submarine sub1 = new Submarine("yellow","BoatsRUs","BigBoi","18493");

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getRegistration() + " " + vehicle.getColour() + " " + vehicle.getMake() + " " + vehicle.getModel());
        }

        System.out.println(car3.storageSize());
        System.out.println(sub1.land());
    }
}
