/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author COREI5 8VA
 */
public class Archivo {

    public void leerArchivo(String nombreArchivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        System.out.println("Contenido del archivo:");
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }
        lector.close();
    }

}
