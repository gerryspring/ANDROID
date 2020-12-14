package com.example.agency.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DATABase extends SQLiteOpenHelper {
    public static int VERSION =15;
    public String sqlCreateCars = "CREATE TABLE AUTOS (PLATE TEXT PRIMARY KEY, BRAND TEXT,MODEL TEXT, YEAR INTEGER,CVCLIENT INTEGER)";
    public String sqlCreateClients ="CREATE TABLE CLIENTES (ID INTEGER PRIMARY KEY, NAME TEXT, STATE TEXT, CITY TEXT,COLONY TEXT) ";
    public String sqlCreateService ="CREATE TABLE SERVICES (ID INTEGER PRIMARY KEY, PLATE TEXT, KM INTEGER,IMPORTE INTEGER,DATE TEXT)";

   public DATABase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreateCars);
        db.execSQL(sqlCreateClients);
        db.execSQL(sqlCreateService);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS AUTOS");
        db.execSQL(sqlCreateCars);
        db.execSQL("DROP TABLE IF EXISTS CLIENTES");
        db.execSQL(sqlCreateClients);
        db.execSQL("DROP TABLE IF EXISTS SERVICES");
        db.execSQL(sqlCreateService);
    }
}
