/*
 *This program is to test an iterative structure. 
 *You would be much better off playing Call of Duty than consulting these crappy programs.
 */
package com.mycompany.ejercicioedd4bis;
import java.util.Scanner;
/**
 *@author Ricardo Santiago Tomé - RicardoSantom en github
 * @since 22/11/2020
 * @1.0
 */
public class Iterativa {

  
   
    public static void main(String[] args) {
        
        int n;
       Scanner teclado =new Scanner(System.in);
       
       do{
            System.out.println("Introduzca un número: ");
             n=teclado.nextInt();
       }while(n>=0);
       System.out.println("Te ha costado dejar de meter números ¿¡EH!?");
       System.out.println("Era para que probaras la potencia de una iterativa.");
       
    }
    
}
