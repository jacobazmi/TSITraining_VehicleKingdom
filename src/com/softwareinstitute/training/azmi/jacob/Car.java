package com.softwareinstitute.training.azmi.jacob;

public class Car extends FourWheeler implements IStore, ICarryPassenger{

    //////////Attributes//////////

    private String colour;
    private int doors;
    private String make;
    private String model;


    //////////Constructors//////////

    public Car(){

    }

    public Car(String colour, int doors, String make, String model){
        this.colour = colour;
        this.doors = doors;
        this.make = make;
        this.model = model;
    }



    //////////Methods////////////

    @Override
    public void storageCapacity(){

    }

    @Override
    public void storageLocation(){

    }

    @Override
    public void passengerQty(){

    }

    @Override
    public void passengerPosition(){

    }



    //Getters & Setters//


    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
