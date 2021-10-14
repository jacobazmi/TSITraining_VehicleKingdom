package com.softwareinstitute.training.azmi.jacob;

import java.util.ArrayList;

public class VehicleCollection {
    /////////Attributes///////

    private ArrayList<Vehicle> vehicles;

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    ////////Constructors////////////////

    public VehicleCollection(ArrayList<Vehicle> vehicles){
        this.vehicles = new ArrayList<>(vehicles);
    }

    ///////////Methods///////////////
}
