package com.example.agency.model.CRUD;

import com.example.agency.view.CRUDActivity;

public  class CRUDCar extends CRUD {

    public CRUDCar(CRUDActivity activity) {
        super(activity);

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

    public void setInterface(){


    }


}
