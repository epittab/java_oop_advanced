package com.OOP_advanced.Computer;

public class Main {
    
    public static void main(String[] args) {
        //code
        Monitor monitor = new Monitor("VG2455", "ViewSonic", new Resolution(1920, 1080));
        monitor.getManufacturer();
        monitor.getModel();
        monitor.getRes();
    }
}
