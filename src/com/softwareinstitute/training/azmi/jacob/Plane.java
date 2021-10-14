package com.softwareinstitute.training.azmi.jacob;

public class Plane extends Aircraft implements IStore, ICarryPassenger{

    //////////// Attributes/////////////

    private String colour;

    /////////////Constructors/////////////////
    public Plane(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }

    ////////////Methods///////////////////


    @Override
    public void storageSize() {
        System.out.println("A plane has a large storage area");
    }

    @Override
    public void storageLocation() {
        System.out.println("A plane's storage area is under the passenger compartment");
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
