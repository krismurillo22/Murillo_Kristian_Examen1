/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_progra2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Muelle extends JFrame{
    
    private final ArrayList<Barco> guardarBarcos;

    BarcoPesquero pesquero;
    BarcoPasajero pasajero;
    TipoPesquero tipopesquero;
    public Muelle() {
        guardarBarcos = new ArrayList<>();
        Main();
    }
    
    private void Main(){
        setTitle("Barcos Murillo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Bienvenido a BARCOS MURILLO");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);
        
        JPanel buttonPanel = new JPanel();
        JButton Agregar=crearBoton("Agregar Barco");
        JButton AgregarElem=crearBoton("Agregar Elementos");
        JButton Vaciar=crearBoton("Vaciar Barco");
        JButton FechaBa=crearBoton("Lista de Bacos");
        JButton Salir=crearBoton("Salir");

        buttonPanel.add(Agregar);
        buttonPanel.add(AgregarElem);
        buttonPanel.add(Vaciar);
        buttonPanel.add(FechaBa);
        buttonPanel.add(Salir);       
        
        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = JOptionPane.showInputDialog("Ingresa el tipo de barco:");
                if (tipo != null){
                    tipo= tipo.toUpperCase();
                    if (tipo.equals("PESQUERO")){
                        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del barco:");
                        TipoPesquero tipoPesquero = (TipoPesquero) JOptionPane.showInputDialog(null,
                                "Seleccione el tipo de pesquero:",
                                "Tipo de Pesquero",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                TipoPesquero.values(),
                                TipoPesquero.PEZ);
                        guardarBarcos.add(new BarcoPesquero(nombre, tipoPesquero));
                    }else if(tipo.equals("PASAJERO")){
                        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del barco:");
                        int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog(this, "Capacidad de pasajeros:"));
                        double precioBoleto = Double.parseDouble(JOptionPane.showInputDialog(this, "Precio del boleto:"));
                        guardarBarcos.add(new BarcoPasajero(nombre, numPasajeros, precioBoleto));
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
                    }
                }
            }
        });
        
        AgregarElem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del barco:");
                if (Buscar(nombre)!=null){
                    Buscar(nombre).agregarElemento();
                }else{
                    JOptionPane.showMessageDialog(null, "Barco no ecnontrado.");
                }
                
            }
        });
        
        Vaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = JOptionPane.showInputDialog("Ingresa el tipo de barco:");
                if (tipo != null){
                    tipo= tipo.toUpperCase();
                    if (tipo.equals("PESQUERO")){
                        
                    }else if(tipo.equals("PASAJERO")){
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
                    }
                }
            }
        });
        
        FechaBa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = JOptionPane.showInputDialog("Ingresa el tipo de barco:");
                if (tipo != null){
                    tipo= tipo.toUpperCase();
                    if (tipo.equals("PESQUERO")){
                        
                    }else if(tipo.equals("PASAJERO")){
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
                    }
                }
            }
        });
        
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        add(titlePanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    private JButton crearBoton(String nombre){//Esto me lo recomdendo Josh cuando hicimos el ahoracado.
        JButton boton = new JButton(nombre);
        boton.setPreferredSize(new Dimension(180, 50));
        Color colorNuevoOtros = new Color(139, 64, 66);
        boton.setBackground(colorNuevoOtros);
        boton.setForeground(Color.WHITE);
       
        return boton;
    }
    
    public static void main(String[] args) {
        new Muelle();
    }
    
    public Barco Buscar(String nombre){
        for (int contar=0; contar<guardarBarcos.size();contar++){
            Barco barco= guardarBarcos.get(contar);
            if (barco.getNombre().equals(nombre)){
                return barco;
            }
        }
        return null;
    }
}
