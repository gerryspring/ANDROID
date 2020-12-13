package com.example.agency.model;

public class Car {

    public String plate,brand,model;
    public int year,cvclient;

    public Car(String plate, String brand, String model, int year,int cvclient) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.cvclient = cvclient;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCvclient() {
        return cvclient;
    }

    public void setCvclient(int cvclient) {
        this.cvclient = cvclient;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
