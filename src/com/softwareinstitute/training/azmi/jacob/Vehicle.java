package com.softwareinstitute.training.azmi.jacob;

import java.time.LocalDate;

public abstract class Vehicle {

    //////////Attributes//////////

    private String name;
    private LocalDate manufactureDate;


    //////////Constructors//////////

    public Vehicle(String name){
        this.name = name;
    }


    //////////Methods////////////

    public void stop(){
        System.out.println("Vehicle is off");
    }

    public void start(){
        System.out.println("Vehicle is on");
    }

    public abstract void park();


    public String getName() {
        return name;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
