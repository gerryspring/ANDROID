package com.example.agency.listeners;

import android.view.View;

import com.example.agency.view.CRUDActivity;

public class CRUDListeners implements View.OnClickListener {

    CRUDActivity activity;

    public CRUDListeners(CRUDActivity act) {
        activity = act;
    }

    @Override
    public void onClick(View evt) {
        if (evt == activity.btnBack) {
            activity.back();
            return;
        }
        if (evt == activity.btnConsult) {
            activity.consult();
            return;
        }

        if (evt == activity.btnCreate)
            activity.create();
            return;
        }
    }

