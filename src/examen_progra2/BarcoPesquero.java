/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra2;

/**
 *
 * @author User
 */
public class BarcoPesquero extends Barco{
    private int pecesCapturados;
    private final TipoPesquero tipoPesquero;

    public BarcoPesquero(String nombre, TipoPesquero tipoPesquero) {
        super(nombre);
        this.pecesCapturados = 0;
        this.tipoPesquero = tipoPesquero;
    }

    public void agregarElemento() {
        pecesCapturados++;
    }

    public double vaciarCobrar() {
        pecesCapturados = 0;
        return pecesCapturados * tipoPesquero.getPrice();
    }

    public double precioElemento() {
        return tipoPesquero.getPrice();
    }

    public String toString() {
        return super.toString() + "\nTipo de pesquero: " + tipoPesquero + "\nPeces capturados: " + pecesCapturados;
    }
}
