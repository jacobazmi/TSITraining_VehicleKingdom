package com.softwareinstitute.training.azmi.jacob;

import java.sql.SQLOutput;

public class ContainerShip extends Watercraft implements IStore{

    //////////Attributes//////////

    private String colour;

    ///////////Constructors//////////
    public ContainerShip(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }


    ///////////Methods////////////
    @Override
    public void storageSize(){
        System.out.println("The container ship can store lots of storage containers");
    }

    @Override
    public void storageLocation(){
        System.out.println("The container ship storage area is the back section of the ship");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
