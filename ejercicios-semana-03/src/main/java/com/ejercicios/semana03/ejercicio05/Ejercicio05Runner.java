/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio05;

import com.ejercicios.semana03.ejercicio05.Auto.Motor;
import java.util.Scanner;

/**
 *
 * @author Mileny
 */
public class Ejercicio05Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Ingresar marca del auto: ");
        String marca = sc.nextLine();

        Auto auto1 = new Auto(marca);
        
        System.out.println("\nMotores disponibles:");
        System.out.println("1. V8");
        System.out.println("2. Electrico");
        System.out.println("3. Hibrido");
        System.out.println("4. V9");
        
        System.out.print("Elige el tipo de motor 1-4: ");
        int opcion = sc.nextInt();
        
        String tipoMotor;
        switch(opcion) {
            case 1: 
                tipoMotor = "V8"; 
                break;
            case 2: 
                tipoMotor = "Electrico"; 
                break;
            case 3: 
                tipoMotor = "Híbrido"; 
                break;
            case 4: 
                tipoMotor = "GLP"; 
                break;
            default: 
                tipoMotor = "V8"; 
        }
        
        Motor motor1 =auto1.new Motor(tipoMotor);
        
        System.out.println("\n=== INFO. AUTO ===");
        System.out.println("Auto: " + marca);
        System.out.println("Tipo de motor: " + motor1.getTipoMotor());
        
        sc.close();
    }
}
