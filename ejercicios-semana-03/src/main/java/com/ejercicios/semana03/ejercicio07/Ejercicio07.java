package com.ejercicios.semana03.ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un dividendo: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese un divisor: ");
            int numero2 = scanner.nextInt();

            Division division = new Division(numero1, numero2);

            int resultado = division.dividir();
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");

        } finally {
            scanner.close();
        }

    }
}
