package com.example.agency.view;

import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.R;
import com.example.agency.controller.CRUDListeners;
import com.example.agency.model.CRUD.CRUD;
import com.example.agency.model.CRUD.CRUDCar;
import com.example.agency.model.CRUD.CRUDClient;
import com.example.agency.model.CRUD.CRUDService;


public class CRUDActivity extends AppCompatActivity {

    CRUD Crud;
    CRUDListeners listeners;
    public static String pos = "";

   public TextView lbl1,lbl2,lbl3,lbl4,lbl5;
   public EditText box1,box2,box3,box4,box5;
   public ImageView source;
   public Button btnBack,btnConsult,btnCreate;
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

        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        box5 = findViewById(R.id.box5);

        btnBack = findViewById(R.id.btnBack);
        btnConsult = findViewById(R.id.btnConsult);
        btnCreate = findViewById(R.id.btnCreate);

        source = findViewById(R.id.view);
        listeners = new CRUDListeners(this);
        btnBack.setOnClickListener(listeners);
        btnConsult.setOnClickListener(listeners);
        btnCreate.setOnClickListener(listeners);
        update();
    }

    public void setListeners(){

    }

    public void update(){
        switch (pos){
            case "A":
                Crud = new CRUDCar();
                System.out.println("CRUD DE CARROS");
                source.setImageResource(R.drawable.ic_car);
                break;
            case "C":
                Crud = new CRUDClient();
                System.out.println("CRUD DE CLIENTES");
                source.setImageResource(R.drawable.teamwork);
                break;
            case "S":
                Crud = new CRUDService();
                System.out.println("CRUD DE SERVICIOS");
                source.setImageResource(R.drawable.form);
                break;
        }

        setUp();
    }

    public void setUp(){
        String [] vector = Crud.getLabels();

        lbl1.setText(vector[0]);
        lbl2.setText(vector[1]);
        lbl3.setText(vector[2]);
        lbl4.setText(vector[3]);
        lbl5.setText(vector[4]);

    }

    public void create() {

        CRUDCar cars = new CRUDCar();

    }


    public String getBox1() {
        return box1.getText().toString();
    }

    public String getBox2() {
        return box2.getText().toString();
    }

    public String getBox3() {
        return box3.getText().toString();
    }

    public String getBox4() {
        return box4.getText().toString();
    }

    public String getBox5() {
        return box5.getText().toString();
    }

}
