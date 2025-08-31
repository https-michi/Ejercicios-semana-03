package com.ejercicios.semana03.ejercicio3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edward Núñez
 */
public class Contador {
    private static int totalObjetos = 0;
    
public Contador (){
     totalObjetos++;
}

public static void mostrarTotal(){
     System.out.println("Contador de objetos: " + totalObjetos);
}

}
