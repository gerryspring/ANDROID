package com.example.agency.model.CRUD;

import com.example.agency.DB.DBManager;
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

    @Override
    public void create(CRUDActivity context) {
        DBManager.createService(Integer.parseInt(boxes[0]),boxes[1],Integer.parseInt(boxes[2]),Integer.parseInt(boxes[3]),boxes[4],context);

    }

}
