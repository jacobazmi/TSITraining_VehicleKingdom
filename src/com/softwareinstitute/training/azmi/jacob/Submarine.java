package com.softwareinstitute.training.azmi.jacob;

public class Submarine extends Watercraft implements IChangeAltitude{

    ///////////Attributes////////////

    private String colour;


    ///////////Constructors///////////
    public Submarine(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }

    //////////Methods///////////


    @Override
    public void moveUp() {
        System.out.println("A submarine can move up through water");
    }

    @Override
    public void moveDown() {
        System.out.println("A submarine can move down through water");
    }

    @Override
    public void land() {
        System.out.println("A submarine can surface anywhere with open water");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
