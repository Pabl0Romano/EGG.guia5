
package com.mycompany.ejerciciosguia5;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int numero2 = leer.nextInt();
        if (numero1 > 25 && numero2 > 25){
            System.out.println("Ambos numeros son mayores a 25");
        } else if (numero1 > 25){
            System.out.println("El primer numero es mayor a 25");
        } else if(numero2 > 25){
            System.out.println("El segundo numero es mayor a 25");
        } else {
            System.out.println("ninguno de los numeros es mayor a 25");
        }    
    }
}