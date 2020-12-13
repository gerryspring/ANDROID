package com.example.agency.model.CRUD;

import android.database.sqlite.SQLiteConstraintException;

import androidx.appcompat.app.AlertDialog;

import com.example.agency.view.CRUDActivity;

public  class CRUDCar extends CRUD {
    public String plate,brand,model;
    int year,cvc;

    public CRUDCar() {

        setLabels();
        setSource();
    }

    @Override
    public void setLabels() {
        labels[0] = "PLACA";
        labels[1] = "MARCA";
        labels[2] = "MODELO";
        labels[3] = "AÑO";
        labels[4] = "C.CLIENTE";

}

  @Override
    protected void setSource() {
        source = "ic_car";
    }


    public void setData(String plate,String brand,String model,int year,int cvc){
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.year  = year;
        this.cvc = cvc;

    }


}
