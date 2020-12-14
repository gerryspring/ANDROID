package com.example.agency.DB;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.model.Car;

import java.util.ArrayList;

public class DBManager {
  static  public DATABase Connection;
  static  public SQLiteDatabase DB;

    public static boolean  startDB(AppCompatActivity context){
        Connection = new DATABase(context, "AGENCIA", null, DATABase.VERSION);

        if (Connection == null) {
            AlertDialog Alerta = new AlertDialog.Builder(context).create();
            Alerta.setMessage("LA conexion NO se ha hecho");
            Alerta.show();
            return false;
        }
        DB = Connection.getWritableDatabase();
        if (DB == null) {

            AlertDialog Alerta = new AlertDialog.Builder(context).create();
            Alerta.setMessage("LA BD NO ESTÁ PREPARADA PARA LECTURA Y ESCRITURA");
            Alerta.show();
            return false;
        }

        return true;
    }

    public static boolean createCar(String plate,String brand,String model,int year,int cvc,AppCompatActivity context){

        String cadena="INSERT INTO AUTOS (PLATE,BRAND,MODEL,YEAR,CVCLIENT) VALUES('" +plate + "','" + brand + "','"+model+"','"+year+"','" + cvc + "')" ;
        try {
            DB.execSQL(cadena);
        } catch (SQLiteConstraintException E){
            AlertDialog Alerta = new AlertDialog.Builder(context).create();
            Alerta.setMessage("se presentó una violación de integridad, se intentó grabar mas de una tupla con la misma placa");
            Alerta.show();
            return false;
        }

        return true;
    }

    public static void consultCars(AppCompatActivity context, ArrayList<Car> array){
        String cadena;

        cadena = "SELECT * FROM AUTOS ORDER BY PLATE";
        Cursor c = DB.rawQuery(cadena, null);
        if (c.getCount() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(context).create();
            alertDialog.setTitle("Recuperando ");
            alertDialog.setMessage("NO HAY AUTOS REGISTRADOS");
            alertDialog.show();
            return;
        }

        String plate,brand,model;
        int year,cvclient;

        while(c.moveToNext()){
            plate = c.getString(0);
            brand = c.getString(1);
            model = c.getString(2);
            year = c.getInt(3);
            cvclient = c.getInt(4);

            array.add(new Car(plate,brand,model,year,cvclient));
           // cars += plate+"\t"+brand+"\t"+model+"\t"+year+"\t"+cvclient+"\n";
        }
    }

    public static boolean createClient(int id,String name,String state,String city,String colony,AppCompatActivity context){

        String cadena="INSERT INTO CLIENTES (ID,NAME,STATE,CITY,COLONY) VALUES('" +id + "','" + name + "','"+state+"','"+city+"','" + colony + "')" ;
        try {
            DB.execSQL(cadena);
        } catch (SQLiteConstraintException E){
            AlertDialog Alerta = new AlertDialog.Builder(context).create();
            Alerta.setMessage("se presentó una violación de integridad, se intentó grabar mas de una tupla con la misma placa");
            Alerta.show();
            return false;
        }

        return true;
    }

    public static String consultClients(AppCompatActivity context) {
        String cadena;

        cadena = "SELECT * FROM CLIENTES ORDER BY NAME";
        Cursor c = DBManager.DB.rawQuery(cadena, null);
        if (c.getCount() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(context).create();
            alertDialog.setTitle("Recuperando ");
            alertDialog.setMessage("NO HAY CLIENTES REGISTRADOS");
            alertDialog.show();
            return null;
        }

        String clients = "",name,state,city,colony;
        int id;

        while(c.moveToNext()){
            id = c.getInt(0);
            name = c.getString(1);
            state = c.getString(2);
            city = c.getString(3);
            colony = c.getString(4);
            System.out.println(id+"\t"+name+"\t"+state+"\t"+city+"\t"+colony+"\n");
            clients += id+"\t"+name+"\t"+state+"\t"+city+"\t"+colony+"\n";
        }
            return clients;
    }
    public static boolean createService(int id,String plate,int km,int importe,String date,AppCompatActivity context){

        String cadena="INSERT INTO SERVICES (ID,PLATE,KM,IMPORTE,DATE) VALUES('" +id + "','" +plate + "','"+km+"','"+importe+"','" + date + "')" ;
        try {
            DB.execSQL(cadena);
        } catch (SQLiteConstraintException E){
            AlertDialog Alerta = new AlertDialog.Builder(context).create();
            Alerta.setMessage("se presentó una violación de integridad, se intentó grabar mas de una tupla con la misma placa");
            Alerta.show();
            return false;
        }

        return true;
    }
    public static String consultServices(AppCompatActivity context) {
        String cadena;

        cadena = "SELECT * FROM SERVICES ORDER BY ID";
        Cursor c = DBManager.DB.rawQuery(cadena, null);
        if (c.getCount() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(context).create();
            alertDialog.setTitle("Recuperando ");
            alertDialog.setMessage("NO HAY SERVICIOS REGISTRADOS");
            alertDialog.show();
            return null;
        }

        String services = "",plate,date;
        int id,km,importe;

        while(c.moveToNext()){
            id = c.getInt(0);
            plate = c.getString(1);
            km = c.getInt(2);
            importe = c.getInt(3);
            date = c.getString(4);
            services += id+"\t"+plate+"\t"+km+"\t"+importe+"\t"+date+"\n";
        }
        return services;
    }

}

