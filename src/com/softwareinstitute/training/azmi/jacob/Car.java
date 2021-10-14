package com.softwareinstitute.training.azmi.jacob;


public class Car extends FourWheeler implements IStore{

    //////////Attributes//////////

    private String colour;
    private String make;
    private String model;

    private String storageSize;
    private String storageLocation;
    private String x;

    //////////Constructors//////////
    public Car(String colour, String make, String model, String registration, String x){
        super(registration, colour, make, model);
        this.storageSize = "Car has medium storage capacity";
        this.storageLocation = "Boot at back of car";
        this.x = x;
    }





    //////////Methods////////////
    @Override
    public String getstorageSize(){
        return storageSize;
    }

    @Override
    public String getstorageLocation(){
        return storageLocation;
    }

    public String getX(){
        return x;
    }

}
