/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio02;

/**
 *
 * @author snowden
 */
public class Conversor {

    //formula: F = C * 9/5 + 32
    public static double convertir(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //formula: 1 km = 0.621371 mi
    public static double convertir(int kilometros) {
        return kilometros * 0.621371;
    }

    //minutos a segundos
    public static String convertir(long segundos) {
    return String.format("%d min %02d s", segundos / 60, segundos % 60);
}

}
