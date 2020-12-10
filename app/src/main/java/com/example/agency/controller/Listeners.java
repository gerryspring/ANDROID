package com.example.agency.controller;

import android.content.Intent;
import android.view.View;

import com.example.agency.view.ClientActivity;
import com.example.agency.view.MainActivity;
import com.example.agency.view.CarActivity;

public class Listeners implements View.OnClickListener {
    MainActivity activity;

    public Listeners(MainActivity act){
        this.activity = act;
    }
    @Override
    public void onClick(View evt) {

        if(evt == activity.btnCars){
            Intent ObjInt = new Intent(activity, CarActivity.class);
            activity.startActivity(ObjInt);
            return;
        }

        if(evt == activity.btnClients){
            Intent ObjInt = new Intent(activity, ClientActivity.class);
            activity.startActivity(ObjInt);
            return;
        }
    }
}
