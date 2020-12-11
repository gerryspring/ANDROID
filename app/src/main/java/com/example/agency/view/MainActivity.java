package com.example.agency.view;

import android.os.Bundle;

import com.example.agency.R;
import com.example.agency.controller.MainListeners;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   public Button btnCars,btnClients,btnServices,btnReports;
   MainListeners list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new MainListeners(this);

        btnCars = findViewById(R.id.btnCars);
        btnClients = findViewById(R.id.btnClients);
        btnServices = findViewById(R.id.btnServices);
        btnReports = findViewById(R.id.btnReports);

        btnCars.setOnClickListener(list);
        btnClients.setOnClickListener(list);
        btnServices.setOnClickListener(list);


    }




}