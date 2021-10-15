package com.softwareinstitute.training.azmi.jacob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car1 = new Car("red","Ford","Fiesta","BK56EEP",4);
        Vehicle car2 = new Car("blue","VW","Polo","BB50GGT",3);

        // unsure if new object needs to be added as Car, Submarine etc. or superclass as interfaces do not work without
        Car car3 = new Car("black","VW","Golf","CB15RPD",4);
        Submarine sub1 = new Submarine("yellow","BoatsRUs","BigBoi","18493");


        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(sub1);


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getRegistration() + " " + vehicle.getColour() + " " + vehicle.getMake() + " " + vehicle.getModel());
        }

        System.out.println(car3.storageSize());
        System.out.println(sub1.land());

        System.out.println(car3.passengerQty());
    }
}
