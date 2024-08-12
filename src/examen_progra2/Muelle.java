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
    
}
