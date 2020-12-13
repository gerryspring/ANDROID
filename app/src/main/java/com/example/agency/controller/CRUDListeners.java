package com.example.agency.controller;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.agency.view.CRUDActivity;
import com.example.agency.view.ConsultActivity;
import com.example.agency.view.MainActivity;

public class CRUDListeners implements View.OnClickListener {

    CRUDActivity activity;

    public CRUDListeners(CRUDActivity act){
        activity = act;
    }
    @Override
    public void onClick(View evt) {
        if(evt == activity.btnBack){
            Intent ObjInt = new Intent(activity, MainActivity.class);
            activity.startActivity(ObjInt);
            return;
        }
        if(evt == activity.btnConsult){
            Intent ObjInt = new Intent(activity, ConsultActivity.class);
            ConsultActivity.pos = activity.pos;
            activity.startActivity(ObjInt);
            return;
        }

        if(evt == activity.btnCreate){
            switch (CRUDActivity.pos) {

                case "A":
                    String plate = activity.getBox1();
                    String brand = activity.getBox2();
                    String model = activity.getBox3();
                    int year = Integer.parseInt(activity.getBox4());
                    int cvc = Integer.parseInt(activity.getBox5());
                if (plate.length() == 0 || brand.length() == 0 || model.length() == 0 || year < 1980 || cvc <0) {
                    Toast msg = Toast.makeText(activity.getBaseContext(), "FALTÓ CAPTURAR ALGÚN DATO", Toast.LENGTH_LONG);
                    msg.show();
                    return;
                }

                activity.createCar(plate,brand,model,year,cvc);
            }
        }

    }
}
