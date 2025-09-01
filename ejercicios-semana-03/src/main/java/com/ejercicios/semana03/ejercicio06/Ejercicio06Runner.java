/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio06;

import com.ejercicios.semana03.ejercicio05.Auto;
import java.util.Scanner;

/**
 *
 * @author Milenyay 
 */
public class Ejercicio06Runner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== LIBROS ===");
        System.out.println("1. Perdida");
        System.out.println("2. El Resplandor");
        System.out.println("3. El Ladron del Rayo");
        
        System.out.print("\nElige un libro 1-3: ");
        int opcion = sc.nextInt();
        
        Libro libroOpcion = null;
        
     switch(opcion) {
            case 1:
                libroOpcion = new Libro("Perdida", "Gillian Flynn");
                libroOpcion.mostrarPag(1, "Era el dia de mi aniversario de bodas cuando mi esposa desaparecio. Cinco \n"
                        + "aniversarios de matrimonio, y Amy eligio ese dia para esfumarse. No dejo una nota, no hubo \n"
                        + "senales de lucha, simplemente se desvanecio como si nunca hubiera existido. La policia \n"
                        + "me mira con sospecha, los vecinos susurran, y yo se que todos piensan lo mismo.");
                break;
                
            case 2:
                libroOpcion = new Libro("El Resplandor", "Stephen King");
                libroOpcion.mostrarPag(1, "El hotel Overlook se alzaba majestuoso en las cumbres de Colorado, sus \n"
                        + "ventanas vacias mirando el valle como ojos ciegos. Jack Torrance conducia lentamente \n"
                        + "por el serpenteante camino, con su esposa Wendy y su hijo Danny en el asiento trasero.\n");
                break;
                
            case 3:
                libroOpcion = new Libro("Percy Jackson: El Ladron del Rayo", "Rick Riordan");
                libroOpcion.mostrarPag(1, "Mi nombre es Percy Jackson y soy un mestizo. Si estas leyendo esto porque \n"
                        + "crees que podrias ser uno tambien, mi consejo es: cierra este libro ahora mismo. \n"
                        + "Cree cualquier mentira que te hayan contado tus padres sobre tu nacimiento, y trata \n"
                        + "de llevar una vida normal. Ser mestizo es peligroso.");
                break;
                
            default:
                System.out.println("Libro no disponible. Mostrando Perdida por defecto.");
                libroOpcion = new Libro("Perdida", "Gillian Flynn");
                libroOpcion.mostrarPag(1, "Era el dia de mi aniversario de bodas cuando mi esposa desaparecio. Cinco \n"
                        + "aniversarios de matrimonio, y Amy eligio ese dia para esfumarse. No dejo una nota, no hubo \n"
                        + "senales de lucha, simplemente se desvanecio como si nunca hubiera existido. La policia \n"
                        + "me mira con sospecha, los vecinos susurran, y yo se que todos piensan lo mismo.");
                break;
        }
        sc.close();
    }
}
