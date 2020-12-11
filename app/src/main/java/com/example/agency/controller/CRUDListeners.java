package com.example.agency.controller;

import android.content.Intent;
import android.view.View;

import com.example.agency.view.CRUDActivity;
import com.example.agency.view.MainActivity;

public class CRUDListeners implements View.OnClickListener {

    CRUDActivity crudActivity;

    public CRUDListeners(CRUDActivity act){
        crudActivity = act;
    }
    @Override
    public void onClick(View evt) {
        if(evt == crudActivity.btnBack){
            Intent ObjInt = new Intent(crudActivity, MainActivity.class);
            crudActivity.startActivity(ObjInt);
            return;
        }
    }
}
