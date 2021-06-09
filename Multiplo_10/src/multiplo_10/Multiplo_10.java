/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo_10;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Multiplo_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introducir un numero que sea multiplo de 10");
       numero = entrada.nextInt();
       if(numero%10==0){
           System.out.println("El número es multiplo de 10");
       }else{
           System.out.println("El número no es multiplo de 10");
       }
       
    }
    
}
