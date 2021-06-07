/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_joptionpane;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Java_JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int num;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Escribe lo que quieras: ");
        num = Integer.parseInt(JOptionPane.showInputDialog("QUÉ QUIERES"));  
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Decimales"));
        JOptionPane.showMessageDialog(null, decimal);
        JOptionPane.showMessageDialog(null, cadena);
        JOptionPane.showMessageDialog(null, num);           
    }
    
}
