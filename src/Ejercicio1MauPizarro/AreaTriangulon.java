//Inicio del Codigo
//Primer ejemplo del ejercicio 1
package Ejercicio1MauPizarro;

import java.util. Scanner;
public class AreaTriangulon {
    static Scanner Starting;
    public static void main(String[] args)    {
        Starting = new Scanner (System.in);
        int h,b,final_result;
        
        System.out.println("Hol@ :) Escribe la altura deseada");
        h= Starting.nextInt ();
        System.out.println(" Hola nuevamente, ahora escribe la base deseada");
        b= Starting.nextInt ();
        
        final_result= h*b;
        System.out.println("Aqui tienes el resultado, el area del rectangulo es " + final_result);
                 
                
                
      
    }
    
}
