/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.ejerciciosguia5;
import java.util.Scanner;

public class ejercicio10 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = leer.nextInt();
        int n4 = leer.nextInt();
        
        System.out.println("===============================");
        System.out.print(n1);
        for (int i = 0; i < n1;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n2);
        for (int i = 0; i < n2;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n3);
        for (int i = 0; i < n3;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n4);
        for (int i = 0; i < n4;i++){
            System.out.print("*");
        }
    }

}
