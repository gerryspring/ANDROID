package com.example.agency.view;

import android.content.Intent;
import android.os.Bundle;

import com.example.agency.DB.DBManager;
import com.example.agency.R;
import com.example.agency.listeners.MAINListeners;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

public class MAINActivity extends AppCompatActivity {

   public Button btnCars,btnClients,btnServices,btnReports;
   MAINListeners list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!startDB())
            return;

        list = new MAINListeners(this);

        btnCars = findViewById(R.id.btnCars);
        btnClients = findViewById(R.id.btnClients);
        btnServices = findViewById(R.id.btnServices);
        btnReports = findViewById(R.id.btnReports);

        btnCars.setOnClickListener(list);
        btnClients.setOnClickListener(list);
        btnServices.setOnClickListener(list);



    }

    private boolean startDB(){
        if(DBManager.startDB(this))
            return true;
        else
            return false;
    }

    public void startCrud(String type){
        Intent ObjInt = new Intent(this, CRUDActivity.class);
        CRUDActivity.pos = type;
        startActivity(ObjInt);
    }





}