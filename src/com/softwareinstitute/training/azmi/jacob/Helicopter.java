package com.softwareinstitute.training.azmi.jacob;

public class Helicopter extends Aircraft implements IChangeAltitude, ICarryPassenger{

    //////////Attributes//////////

    private String colour;
    private String make;

    //////////Constructors//////////
    public Helicopter(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }


    /////////Methods///////////

    @Override
    public void moveUp(){
        System.out.println("A helicopter can move up in the air");
    }

    @Override
    public void moveDown(){
        System.out.println("A helicopter can move down in the air");
    }

    @Override
    public void land(){
        System.out.println("A helicopter can land on helipads");
    }

    @Override
    public void passengerQty() {
        System.out.println("A helicopter can hold 4 passengers");
    }

    @Override
    public void passengerPosition() {
        System.out.println("The passengers sit in the cabin behind the pilot");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
