/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Carlos
 */
class Carro extends Veiculoum{
   
    protected String tipoDeCombustivel;
    
    public Carro(String marca, Integer ano, String modelo, String tipoDeCombustivel) {
        super(marca, ano, modelo);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    @Override
    public void acelerar(){
        System.out.println(modelo + " está acelerando.");
    }
}
