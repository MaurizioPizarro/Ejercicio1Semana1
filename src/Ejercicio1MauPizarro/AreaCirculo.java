//2do Ejemplo del 1er ejercicio

package Ejercicio1MauPizarro;

import java.util. Scanner;
public class AreaCirculo {
    public static void main(String[] args)    {
        Scanner queso = new Scanner (System.in);
        double radio,diametro,area;
        
        System.out.println("Hol@ :) escribe el radio del circulo");
        radio=queso.nextDouble();
        diametro=radio*2;
        area=(3.14)*(radio*radio);
        System.out.println(" Bien, el diametro de este circulo es: "+diametro);
        System.out.println("Finalmente el area del circulo es nada mas y nada menos que: "+area);
                                           
    }
    
}