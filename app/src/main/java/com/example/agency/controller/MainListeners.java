package com.example.agency.controller;

import android.content.Intent;
import android.view.View;

import com.example.agency.view.CRUDActivity;
import com.example.agency.view.MainActivity;

public class MainListeners implements View.OnClickListener {
    MainActivity mainActivity;
    CRUDActivity crudActivity;

    public MainListeners(MainActivity act){
        this.mainActivity = act;
    }

    public MainListeners(CRUDActivity act){
        crudActivity = act;
    }
    @Override
    public void onClick(View evt) {

        if(evt == mainActivity.btnCars){
            Intent ObjInt = new Intent(mainActivity, CRUDActivity.class);
            CRUDActivity.pos = "A";
            mainActivity.startActivity(ObjInt);
            return;
        }

        if(evt == mainActivity.btnClients){
            Intent ObjInt = new Intent(mainActivity, CRUDActivity.class);
            CRUDActivity.pos = "C";
            mainActivity.startActivity(ObjInt);
            return;
        }

        if(evt == mainActivity.btnServices){
            Intent ObjInt = new Intent(mainActivity, CRUDActivity.class);
            CRUDActivity.pos = "S";
            mainActivity.startActivity(ObjInt);
            return;
        }

    }



}
