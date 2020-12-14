package com.example.agency.DAO;

import com.example.agency.model.Car;

import java.util.List;

public interface DAO<T> {

    void insertar(T t);

    void modificar(T t);

    void eliminar(T t);

    List<Car> obtenerTodos();

    T obtener(int id);

}