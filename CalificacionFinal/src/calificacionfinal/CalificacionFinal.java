/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionfinal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalificacionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Scanner entrada = new Scanner(System.in);
        double calificacion, participacion, examen1, examen2, examenF;
        System.out.print("Introduce la participacion del alumno");
        participacion = entrada.nextDouble();
        
        System.out.println("Introduce el resultado del examen 1 del alumno");
        examen1 = entrada.nextDouble();
        
        System.out.println("Introduce el resultado del examen 2 del alumno");
        examen2 = entrada.nextDouble();
        
        System.out.println("Introduce el resultado del examen final del alumno");
        examenF = entrada.nextDouble();
        examenF *= 0.40;
        participacion *= 0.10;
        examen2 *= 0.25;
        examen1 *= 0.25;
        calificacion= participacion + examen1 + examen2 + examenF;
        System.out.println("La calificacion final es de: "+calificacion);
    }
    
}
