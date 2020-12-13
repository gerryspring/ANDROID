package com.example.agency.model.CRUD;

import android.database.sqlite.SQLiteDatabase;

import com.example.agency.DB.DataBase;
import com.example.agency.view.CRUDActivity;

public abstract class CRUD {
  protected String[] labels;
  protected String source;


    public CRUD(){
        labels = new String[5];
    }

    protected abstract void setLabels();
    protected abstract  void setSource();

    public String[] getLabels(){
        return labels;
    }
}
