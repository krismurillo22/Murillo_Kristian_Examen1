/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra2;

import java.util.Calendar;

/**
 *
 * @author User
 */
public abstract class Barco {
    private final String nombre;
    private final Calendar fechaCirculacion;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaCirculacion = Calendar.getInstance();
    }

    public final String getNombre() {
        return nombre;
    }

    public final Calendar getFechaCirculacion() {
        return fechaCirculacion;
    }

    public String toString() {
        return "Nombre del barco: " + nombre;
    }

    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
}
