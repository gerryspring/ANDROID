package com.example.agency.controller;

import android.content.Intent;
import android.view.View;

import com.example.agency.view.CRUDActivity;
import com.example.agency.view.MainActivity;

public class MainListeners implements View.OnClickListener {
    MainActivity activity;

    public MainListeners(MainActivity act){
        this.activity = act;
    }
    @Override
    public void onClick(View evt) {

        if(evt == activity.btnCars){
            Intent ObjInt = new Intent(activity, CRUDActivity.class);
            CRUDActivity.pos = "A";
            activity.startActivity(ObjInt);
            return;
        }

        if(evt == activity.btnClients){
            Intent ObjInt = new Intent(activity, CRUDActivity.class);
            CRUDActivity.pos = "C";
            activity.startActivity(ObjInt);
            return;
        }


        if(evt == activity.btnServices){
            Intent ObjInt = new Intent(activity, CRUDActivity.class);
            CRUDActivity.pos = "S";
            activity.startActivity(ObjInt);
            return;
        }



    }



}
