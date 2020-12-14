package com.example.agency.model.CRUD;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.DB.DBManager;
import com.example.agency.R;
import com.example.agency.view.CRUDActivity;

public class CRUDClient extends CRUD {


    public CRUDClient() {

        setLabels();
        setSource();
    }

    @Override
    public void setLabels() {
        labels[0] = "C.CLIENTE";
        labels[1] = "NOMBRE";
        labels[2] = "ESTADO";
        labels[3] = "CIUDAD";
        labels[4] = "COLONIA";
    }

    @Override
    protected void setSource() {
        source = "teamwork";
    }

    @Override
    public void create(CRUDActivity context) {
        DBManager.createClient(Integer.parseInt(boxes[0]),boxes[1],boxes[2],boxes[3],boxes[4],context);
    }


}
