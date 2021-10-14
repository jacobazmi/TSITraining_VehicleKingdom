package com.softwareinstitute.training.azmi.jacob;

public class ContainerShip extends Watercraft {

    //////////Attributes//////////

    private String colour;

    ///////////Constructors//////////
    public ContainerShip(String colour, String registration) {
        super(registration);
        this.colour = colour;
    }


    ///////////Methods////////////
}
