package com.softwareinstitute.training.azmi.jacob;

import java.sql.SQLOutput;

public class ContainerShip extends Watercraft implements IStore{

    //////////Attributes//////////

    private String colour;

    private String storageSize = "Car has medium storage capacity";
    private String storageLocation = "Boot at back of car";

    ///////////Constructors//////////
    public ContainerShip(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }


    ///////////Methods////////////
    @Override
    public String storageSize(){
        return storageSize;
    }

    @Override
    public String storageLocation(){
        return storageLocation;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
