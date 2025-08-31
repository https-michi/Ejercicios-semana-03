/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio02;

/**
 *
 * @author snowden
 */
public class Ejercicio02Runner {
    public static void main(String[] args) {
        double celsius = 30.0;
        int km = 10;
        long segundos = 125L;

        System.out.printf("%.2f GradosC = %.2f GradosF%n", celsius, Conversor.convertir(celsius));
        System.out.printf("%d km = %.2f millas%n", km, Conversor.convertir(km));
        System.out.printf("%d segundos = %s%n", segundos, Conversor.convertir(segundos));
    }
}

