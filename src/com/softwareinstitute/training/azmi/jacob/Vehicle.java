package com.softwareinstitute.training.azmi.jacob;

import java.time.LocalDate;

public abstract class Vehicle {

    //////////Attributes//////////

    private String registration;
    private LocalDate manufactureDate;


    //////////Constructors//////////

    public Vehicle(String registration){
        this.registration = registration;
    }


    //////////Methods////////////

    public void stop(){
        System.out.println("Vehicle is off");
    }

    public void start(){
        System.out.println("Vehicle is on");
    }


    public String getRegistration() {
        return registration;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
