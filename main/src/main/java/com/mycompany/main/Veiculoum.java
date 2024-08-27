/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Carlos
 */
public class Veiculoum {
    protected String marca;
    protected Integer ano;
    protected String modelo;
    
    public Veiculoum(String marca, Integer ano, String modelo){
        System.out.println(modelo + " está acelerando.");
    }
    public void acelerar(){
        System.out.println(modelo + " está acelerando.");
    }
    public void frear(){
        System.out.println(modelo + " está freando.");
    }
}
