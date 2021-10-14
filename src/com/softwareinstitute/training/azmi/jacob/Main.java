package com.softwareinstitute.training.azmi.jacob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("red","Ford","Fiesta","BK56EEP");
        Car car2 = new Car("blue","VW","Polo","BB50GGT");
        Car car3 = new Car("black","VW","Golf","CB15RPD");
        Submarine sub1 = new Submarine("yellow","BoatsRUs","BigBoi","18493");

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);


        for ( int i = 0; i< vehicles.size(); i++){
            System.out.println(vehicles.get(i).getRegistration() + " " + vehicles.get(i).getColour() + " " +  vehicles.get(i).getMake() + " " +  vehicles.get(i).getModel());
        }

        System.out.println(car3.storageSize());
        System.out.println(sub1.land());
    }
}
