/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosguia5;
import java.util.Scanner;
/**
 *
 * @author romae
 */
public class ejercicio7 {

    /**
     * “La bomba es una bomba de pasta alimenticia”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese un valor entre 1 y 4 para conocer el tipo de motor");
        tipoMotor = leer.nextInt();
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("El numero ingresado es incorrecto");
        }
    }
    
}
