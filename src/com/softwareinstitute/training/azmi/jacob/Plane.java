package com.softwareinstitute.training.azmi.jacob;

public class Plane extends Aircraft implements IStore, ICarryPassenger{

    //////////// Attributes/////////////

    private String colour;

    private String storageSize = "Car has medium storage capacity";
    private String storageLocation = "Boot at back of car";

    /////////////Constructors/////////////////
    public Plane(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }

    ////////////Methods///////////////////


    @Override
    public String getstorageSize(){
        return storageSize;
    }

    @Override
    public String getstorageLocation(){
        return storageLocation;
    }

    @Override
    public void passengerQty() {
        System.out.println("A plane can carry over 100 people");
    }

    @Override
    public void passengerPosition() {
        System.out.println("A plane's passenger compartment is separate from the pilot's cockpit");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
