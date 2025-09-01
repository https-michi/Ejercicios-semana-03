/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio10;

import java.io.IOException;

/**
 *
 * @author COREI5 8VA
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Archivo archivo = new Archivo();

        try {
            archivo.leerArchivo("ejemplo.txt");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
