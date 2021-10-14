package com.softwareinstitute.training.azmi.jacob;

import javax.tools.ForwardingFileObject;

public class Lorry extends FourWheeler {

    //////////Attributes//////////

    private String colour;
    private String size;
    private String make;
    private String model;


    //////////Constructors//////////

    public Lorry(String colour, String size, String make, String model, String registration) {
        super(registration);
        this.colour = colour;
        this.size = size;
        this.make = make;
        this.model = model;
    }



    //////////Methods////////////


}
