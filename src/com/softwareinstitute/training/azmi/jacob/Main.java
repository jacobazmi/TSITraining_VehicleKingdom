package com.softwareinstitute.training.azmi.jacob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car1 = new Car("red","Ford","Fiesta","BK56EEP","sdsdsd");
        Vehicle car2 = new Car("blue","VW","Polo","BB50GGT","fhfhfhf");
        Car car3 = new Car("blue","VW","Polo","BB50GGT","zxzxzxzx");

        vehicles.add(car1);
        vehicles.add(car2);


        for ( int i = 0; i< vehicles.size(); i++){
            System.out.println(vehicles.get(i).getRegistration());
            System.out.println(vehicles.get(i).getColour());
            System.out.println(vehicles.get(i).getMake());
            System.out.println(vehicles.get(i).getModel());
        }

    }
}
