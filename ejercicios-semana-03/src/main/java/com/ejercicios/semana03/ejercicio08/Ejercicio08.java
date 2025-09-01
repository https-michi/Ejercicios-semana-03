/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author COREI5 8VA
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
