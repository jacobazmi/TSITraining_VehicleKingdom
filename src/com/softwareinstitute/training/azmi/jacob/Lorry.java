package com.softwareinstitute.training.azmi.jacob;

import javax.tools.ForwardingFileObject;

public class Lorry extends FourWheeler implements ICarryPassenger, IStore{

    //////////Attributes//////////

    private String colour;
    private String size;
    private String make;
    private String model;

    private String storageSize = "Car has medium storage capacity";
    private String storageLocation = "Boot at back of lorry";

    //////////Constructors//////////

    public Lorry(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }



    //////////Methods////////////


    @Override
    public void passengerQty() {
        System.out.println("The passenger sits next to the lorry driver");
    }

    @Override
    public void passengerPosition() {
        System.out.println("The passenger sits next to the lorry driver");
    }

    @Override
    public String getstorageSize(){
        return storageSize;
    }

    @Override
    public String getstorageLocation(){
        return storageLocation;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
