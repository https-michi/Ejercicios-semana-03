/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio09;

/**
 *
 * @author COREI5 8VA
 */
public class ValidarEdad {
     public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser 18 o mayor.");
        } else {
            System.out.println("Edad válida: " + edad);
        }
    }
    
}
