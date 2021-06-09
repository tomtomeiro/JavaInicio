/*
 * La calificación final de un estudiante de informatica se calcula con base a las calificaciones 
de cuatro aspectos de su rendimiento academico 
Prarticipación, Primer examen parcial, Segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con 
pederaciones de 10%, 25%, 25%, y 40%.

Hacer un programa que calcule e imprima la calificación final obtenida por el estudiante.

 */
package calificación_final;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calificación_Final {

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
