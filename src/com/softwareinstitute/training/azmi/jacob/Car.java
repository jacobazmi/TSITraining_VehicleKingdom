package com.softwareinstitute.training.azmi.jacob;

public class Car extends FourWheeler implements IStore, ICarryPassenger{

    //////////Attributes//////////

    private String colour;
    private int doors;
    private String make;
    private String model;


    //////////Constructors//////////
    public Car(){
        this("Grey");
    }

    public Car(String colour){
        this(colour, 5);
    }

    public Car(String colour, int doors){
        this(colour, doors, "Ford");
    }

    public Car(String colour, int doors, String make){
        this(colour, doors, make, "Fiesta");
    }

    public Car(String colour, int doors, String make, String model){
        super("XX00 XXX");
        this.colour = colour;
        this.doors = doors;
        this.make = make;
        this.model = model;
    }

    public Car(String colour, int doors, String make, String model, String registration){
        super(registration);
        this.colour = colour;
        this.doors = doors;
        this.make = make;
        this.model = model;
    }



    //////////Methods////////////

    @Override
    public void storageCapacity(){
        System.out.println("Car has medium storage capacity");
    }

    @Override
    public void storageLocation(){
        System.out.println("Boot at back of car");
    }

    @Override
    public void passengerQty(){
        int passengers = 4;
    }

    @Override
    public void passengerPosition(){
        String position = "Within cabin";
    }



    //Getters & Setters//


    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
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

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
