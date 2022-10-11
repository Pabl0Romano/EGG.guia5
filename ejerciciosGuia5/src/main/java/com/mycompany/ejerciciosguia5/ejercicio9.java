/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.ejerciciosguia5;
import java.util.Scanner;

public class ejercicio9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int i = 1;
        int suma = 0;
        do {
            System.out.println("ingrese el "+i+" numero.");
            int n = leer.nextInt();
            if (n == 0){
                System.out.println("Se capturo el numero 0");
                System.out.println("la suma de numero hasta el momento fue de: "+suma);
                break;
            } else if (n > 0){
                suma += n;
            }
            i++;
        } while (i<=20);
        if (i >= 20){
            System.out.println("La suma total de los numeros es de: "+suma);
        }
    }

}
