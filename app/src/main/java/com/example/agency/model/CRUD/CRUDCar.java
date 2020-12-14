package com.example.agency.model.CRUD;

import com.example.agency.DB.DBManager;
import com.example.agency.view.CRUDActivity;

public  class CRUDCar extends CRUD {

    public CRUDCar() {
        setLabels();
        setSource();
    }

    public void setLabels() {
        labels[0] = "PLACA";
        labels[1] = "MARCA";
        labels[2] = "MODELO";
        labels[3] = "AÑO";
        labels[4] = "C.CLIENTE";

}

    public void setSource() {
        source = "ic_car";
    }


    public void create(CRUDActivity context) {
        DBManager.createCar(boxes[0],boxes[1],boxes[2],Integer.parseInt(boxes[3]),Integer.parseInt(boxes[4]),context);
    }


}
