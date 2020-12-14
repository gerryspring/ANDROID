package com.example.agency.mysql;

import android.database.sqlite.SQLiteDatabase;

import com.example.agency.DAO.CarDAO;
import com.example.agency.DB.DATABase;
import com.example.agency.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class SQLiteCarDAO implements CarDAO {
    DATABase Connection;
    SQLiteDatabase DB;
   final String INSERT="INSERT INTO AUTOS (PLATE,BRAND,MODEL,YEAR,CVCLIENT) VALUES(?,?,?,?,?)" ;


    public SQLiteCarDAO(DATABase Connection){
        this.Connection = Connection;
    }
    @Override
    public void insertar(Car car) {



    }

    @Override
    public void modificar(Car car) {

    }

    @Override
    public void eliminar(Car car) {

    }

    @Override
    public List<Car> obtenerTodos() {
        return null;
    }

    @Override
    public Car obtener(int id) {
        return null;
    }
}
