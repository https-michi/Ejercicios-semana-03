/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio09;

/**
 *
 * @author COREI5 8VA
 */
public class Ejercicio09 {
        public static void main(String[] args) {
        ValidarEdad validador = new ValidarEdad();

        try {
            validador.verificarEdad(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
