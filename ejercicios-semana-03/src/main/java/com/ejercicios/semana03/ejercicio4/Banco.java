/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4_sem3;

/**
 *
 * @author Edward Núñez
 */
public class Banco {
    private static double tasaInteres;
    
    public static void actualizarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }
     public static void mostrarTasa() {
        System.out.println("La tasa de interés actual es: " + tasaInteres + "%");
     }
        

    
}
