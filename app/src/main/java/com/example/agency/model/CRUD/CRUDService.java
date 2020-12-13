package com.example.agency.model.CRUD;

import com.example.agency.view.CRUDActivity;

public class CRUDService extends CRUD {
    public CRUDService() {
        setLabels();
        setSource();
    }

    @Override
    public void setLabels() {
        labels[0] = "N.ORDEN";
        labels[1] = "PLACA";
        labels[2] = "KILOMETRAJE";
        labels[3] = "IMPORTE";
        labels[4] = "FECHA";
    }

    @Override
    protected void setSource() {
        source = "form";
    }

}
