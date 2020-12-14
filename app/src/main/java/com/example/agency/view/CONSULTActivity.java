package com.example.agency.view;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.DB.DBManager;
import com.example.agency.R;
import com.example.agency.model.Car;

import java.util.ArrayList;

public class CONSULTActivity extends AppCompatActivity {
    TextView h1,h2,h3,h4,h5;
    public static String pos ;
    ListView lista1;
    private ArrayList<Car> myAutos=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        lista1 = findViewById(R.id.idListView);
        String cadena = "";
        show();

    }

    private void show(){
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
        DBManager.consultCars(this,myAutos);

        ArrayAdapter<Car> adapter = new MyListAdapter();
        lista1.setAdapter(adapter);
    }
    public void clientConsult(){
        String data = DBManager.consultClients(this);
    }
    public void serviceConsult(){
        String data = DBManager.consultServices(this);
    }

    private class MyListAdapter extends ArrayAdapter<Car> {

        public MyListAdapter(){
            super(CONSULTActivity.this,R.layout.item_view, myAutos);
        }
        public View getView(int Position, View convertView, ViewGroup parent){
            View itemView=convertView;
            if(itemView==null)
                itemView=getLayoutInflater().inflate(R.layout.item_view,parent,false);

            Car CurrentAuto=myAutos.get(Position);


            TextView lblPlaca= findViewById(R.id.lblPlaca);
            lblPlaca.setText(CurrentAuto.getPlate());

            TextView lblModelo= findViewById(R.id.lblModelo);
            lblModelo.setText(CurrentAuto.getModel());

            TextView lblMarca= findViewById(R.id.lblMarca);
            lblMarca.setText(CurrentAuto.getBrand());

            TextView lblAño= findViewById(R.id.lblYear);
            lblAño.setText(CurrentAuto.getYear());


            return itemView;

        }
    }

}

