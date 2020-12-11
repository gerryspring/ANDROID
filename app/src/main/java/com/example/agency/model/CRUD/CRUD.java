package com.example.agency.model.CRUD;

import android.database.sqlite.SQLiteDatabase;

import com.example.agency.model.DataBase;
import com.example.agency.view.CRUDActivity;

public abstract class CRUD {
  protected static DataBase Conexion;
  protected static SQLiteDatabase DB;
  protected String[] labels;
  protected String source;


    public CRUD(CRUDActivity activity){
        if(Conexion==null){
            Conexion = new DataBase(activity,"AGENCYBD",null,DataBase.VERSION);
            if(Conexion==null){
                System.out.println("No se pudo conectar.");
                return;
            }

            DB = Conexion.getWritableDatabase();
            if(DB == null){
                System.out.println("Solo se permite leer");
                return;
            }
        }


        labels = new String[5];
    }

    protected abstract void setLabels();
    protected abstract  void setSource();
    public String[] getLabels(){
        System.out.println("labels");
        return labels;
    }

    public String getSource(){
        return source;
    }
}
