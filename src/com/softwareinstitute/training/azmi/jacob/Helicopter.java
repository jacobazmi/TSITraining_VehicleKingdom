package com.softwareinstitute.training.azmi.jacob;

public class Helicopter extends Aircraft implements IChangeAltitude, ICarryPassenger{

    //////////Attributes//////////

    private String colour;
    private String make;
    private String model;

    //////////Constructors//////////
    public Helicopter(String colour, String make, String model, String registration) {
        super(registration);
        this.colour = colour;
        this.make = make;
        this.model = model;
    }


    /////////Methods///////////

    @Override
    public void moveUp(){

    }

    @Override
    public void moveDown(){

    }

    @Override
    public void land(){

    }

    @Override
    public void passengerQty() {

    }

    @Override
    public void passengerPosition() {

    }
}
