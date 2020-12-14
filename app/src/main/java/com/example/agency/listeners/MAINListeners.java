package com.example.agency.listeners;

import android.view.View;

import com.example.agency.view.MAINActivity;

public class MAINListeners implements View.OnClickListener {
    MAINActivity activity;

    public MAINListeners(MAINActivity act){
        this.activity = act;
    }
    @Override
    public void onClick(View evt) {

        if(evt == activity.btnCars){
            activity.startCrud("A");
            return;
        }

        if(evt == activity.btnClients) {
            activity.startCrud("C");
            return;
        }

        if(evt == activity.btnServices){
            activity.startCrud("S");
            return;
        }



    }



}
