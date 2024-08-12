/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_progra2;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BarcoPasajero extends Barco{
    private final String[] pasajeros;
    private final double precioBoleto;
    private int contadorPasajeros;

    public BarcoPasajero(String nombre, int numPasajeros, double precioBoleto) {
        super(nombre);
        this.pasajeros = new String[numPasajeros];
        this.precioBoleto = precioBoleto;
        this.contadorPasajeros = 0;
    }

    public void agregarElemento() {
        if (contadorPasajeros < pasajeros.length) {
            String nombre = JOptionPane.showInputDialog("Ingresa su nombre:");
            pasajeros[contadorPasajeros] = nombre;
            contadorPasajeros++;
        } else {
            JOptionPane.showMessageDialog(null, "Introducir un nombre por favor.");
        }
    }

    public double vaciarCobrar() {
        contadorPasajeros = 0;
        return contadorPasajeros*precioBoleto;
    }

    public double precioElemento() {
        return precioBoleto;
    }

    public String toString() {
        return super.toString() + "Cantidad de Pasajeros que compraron boleto: #"+ contadorPasajeros;
    }

    public void listarPasajeros() {
        listarPasajerosRecursiva(0);
    }

    private void listarPasajerosRecursiva(int num) {
        if (num<contadorPasajeros) {
            listarPasajerosRecursiva(num + 1);
        }
    }
}
