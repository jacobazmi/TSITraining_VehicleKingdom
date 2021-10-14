package com.softwareinstitute.training.azmi.jacob;

public class Motorbike extends TwoWheeler {

    ///////////Attributes/////////////////

    private String colour;
    private String make;
    private String model;

    ////////////Constructors//////////////
    public Motorbike(String colour, String make, String model, String registration){
        super(registration);
        this.colour = colour;
        this.make = make;
        this.model = model;
    }

    ///////////Methods/////////////



}
