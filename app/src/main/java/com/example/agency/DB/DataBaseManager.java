package com.example.agency.DB;

import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agency.view.MainActivity;

public class DataBaseManager {
  static  public DataBase Connection;
  static  public SQLiteDatabase DB;

    public static boolean  startDB(AppCompatActivity context){
        Connection = new DataBase(context, "AGENCIA", null, DataBase.VERSION);

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

        System.out.println("si se pudo.");
        return true;
    }
}
