package com.example.agency.view;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.R;

public class ConsultActivity extends AppCompatActivity {
    TextView viewGral;
    public static String pos ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        viewGral = findViewById(R.id.viewGral);

        dothing();
    }


    public void dothing(){
      /*
        String cadena = "";

        cadena = "SELECT * FROM AUTOS ORDER BY YEAR";
        Cursor c = DB.rawQuery(cadena, null);
        if (c.getCount() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Recuperando ");
            alertDialog.setMessage("NO HAY AUTOS REGISTRADOS");
            alertDialog.show();
            return;
        }

        String cars = "",plate,brand,model;
        int year,cvclient;

        while(c.moveToNext()){
            plate = c.getString(0);
            brand = c.getString(1);
            model = c.getString(2);
            year = c.getInt(3);
            cvclient = c.getInt(4);

            cars = plate+"\t"+brand+"\t"+model+"\t"+year+"\t"+cvclient+"\n";
        }

        viewGral.setText(cars);

    }
*/
    }
}
