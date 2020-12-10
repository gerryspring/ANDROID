package com.example.agency.view;

import android.os.Bundle;

import com.example.agency.R;
import com.example.agency.controller.Listeners;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   public Button btnCars,btnClients,btnServices,btnReports;
   Listeners list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new Listeners(this);

        btnCars = findViewById(R.id.btnCars);
        btnClients = findViewById(R.id.btnClients);
        btnServices = findViewById(R.id.btnServices);
        btnReports = findViewById(R.id.btnReports);

        btnCars.setOnClickListener(list);
        btnClients.setOnClickListener(list);


    }




}