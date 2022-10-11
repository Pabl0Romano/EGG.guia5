/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.ejerciciosguia5;
import java.util.Scanner;

public class ejercicio8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota = -1;
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese una nota válida");
            nota = leer.nextInt();
        }
    }

}
