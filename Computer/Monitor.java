package com.OOP_advanced.Computer;

public class Monitor {

    private String model;
    private String manufacturer;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, Resolution resolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void getModel(){
        System.out.println("The model is " + model);
    }

    public void getManufacturer(){
        System.out.println("The manufacturer is " + manufacturer);
    }
    public void getRes(){
        System.out.println("The resolution is " + resolution.getWidth() + " x " + resolution.getHeight());
    }
}
