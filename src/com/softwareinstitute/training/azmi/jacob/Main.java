package com.softwareinstitute.training.azmi.jacob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car1 = new Car("red","Ford","Fiesta","BK56EEP");
        Vehicle car2 = new Car("blue","VW","Polo","BB50GGT");

        vehicles.add(car1);
        vehicles.add(car2);

        System.out.println(vehicles.get(0).getRegistration());
        System.out.println(vehicles.get(1).getRegistration());
    }
}
