package com.example.agency.view;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.DB.DBManager;
import com.example.agency.R;

public class CONSULTActivity extends AppCompatActivity {
    TextView viewGral;
    public static String pos ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        viewGral = findViewById(R.id.viewGral);

        switch (pos){
            case "A":
                carConsult();
                break;
            case "C":
                clientConsult();
                break;
            case "S":
                serviceConsult();
        }
    }

    public void carConsult() {
        String data = DBManager.consultCars(this);
        viewGral.setText(data);
    }
    public void clientConsult(){
        String data = DBManager.consultClients(this);
        viewGral.setText(data);
    }
    public void serviceConsult(){
        String data = DBManager.consultServices(this);
        viewGral.setText(data);
    }

    }

