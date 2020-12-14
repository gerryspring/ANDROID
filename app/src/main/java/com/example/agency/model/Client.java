package com.example.agency.model;

public class Client {
    int id ;
    String name,state,city,colony;

    public Client(int id, String name, String state, String city, String colony) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.city = city;
        this.colony = colony;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }
}
