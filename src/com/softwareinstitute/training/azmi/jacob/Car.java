package com.softwareinstitute.training.azmi.jacob;

public class Car extends FourWheeler implements IStore, ICarryPassenger{

    //////////Attributes//////////

    private String colour;
    private String make;
    private String model;


    //////////Constructors//////////
    public Car(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }




    //////////Methods////////////

    @Override
    public void storageSize(){
        System.out.println("Car has medium storage capacity");
    }

    @Override
    public void storageLocation(){
        System.out.println("Boot at back of car");
    }

    @Override
    public void passengerQty(){
        System.out.println("A car has space for 4 passengers");
    }

    @Override
    public void passengerPosition(){
        System.out.println("Passenger seats are next to and behind the driver");
    }



    //Getters & Setters//


    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
