/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio05;

/**
 *
 * @author Mileny
 */
public class Auto {
    
    private String marca;
    
    public Auto(String marca){
        this.marca = marca;
    }
       
    // Clase anidada 
    
    class Motor{
        private String tipoMotor;
        
        public Motor(String tipoMotor){
            this.tipoMotor = tipoMotor;
        }

        public String getTipoMotor() {
            return tipoMotor;
        }
    } 
    
    public void demostrarMotor() {
        System.out.println("Auto: " + marca);
        
        Motor motor = new Motor("V8");
        System.out.println("Tipo de motor: " + motor.getTipoMotor());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    } 

}
    
    
    
    
    
    
    

