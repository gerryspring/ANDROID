package com.example.agency.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.R;
import com.example.agency.controller.CRUDListeners;
import com.example.agency.controller.MainListeners;
import com.example.agency.model.CRUD.CRUD;
import com.example.agency.model.CRUD.CRUDCar;
import com.example.agency.model.CRUD.CRUDClient;
import com.example.agency.model.CRUD.CRUDService;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CRUDActivity extends AppCompatActivity {

    CRUD crud;
    CRUDListeners listeners;
    public static String pos = "";

   public TextView lbl1,lbl2,lbl3,lbl4,lbl5;
   public ImageView source;
   public Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);

        setInterface();
        setListeners();
//        source.setImageResource(R.drawable.ic_car);
    }


    public void setInterface(){
        lbl1 = findViewById(R.id.lbl1);
        lbl2 = findViewById(R.id.lbl2);
        lbl3 = findViewById(R.id.lbl3);
        lbl4 = findViewById(R.id.lbl4);
        lbl5 = findViewById(R.id.lbl5);

        btnBack = findViewById(R.id.btnBack);


        source = findViewById(R.id.view);
        listeners = new CRUDListeners(this);
        btnBack.setOnClickListener(listeners);
        update();
    }

    public void setListeners(){

    }

    public void update(){
        switch (pos){
            case "A":
                crud = new CRUDCar(this);
                System.out.println("CRUD DE CARROS");
                source.setImageResource(R.drawable.ic_car);
                break;
            case "C":
                crud = new CRUDClient(this);
                System.out.println("CRUD DE CLIENTES");
                source.setImageResource(R.drawable.teamwork);
                break;
            case "S":
                crud = new CRUDService(this);
                System.out.println("CRUD DE SERVICIOS");
                source.setImageResource(R.drawable.form);
                break;
        }

        setUp();
    }

    public void setUp(){
        String [] vector = crud.getLabels();

        for(int i = 0; i < vector.length; i++)
            System.out.println(vector[i]+ "_______________**************____________________________________*");

        lbl1.setText(vector[0]);
        lbl2.setText(vector[1]);
        lbl3.setText(vector[2]);
        lbl4.setText(vector[3]);
        lbl5.setText(vector[4]);


    }
}
