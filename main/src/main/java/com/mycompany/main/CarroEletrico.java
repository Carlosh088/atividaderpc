/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Carlos
 */
class CarroEletrico extends Carro{
    
    protected Integer capacidadeDeBateria;
    
    public CarroEletrico(String marca, Integer ano, String modelo, String tipoDeCombustivel, Integer capacidadeDeBateria) {
        super(marca, ano, modelo, tipoDeCombustivel);
        this.capacidadeDeBateria = capacidadeDeBateria;
    }
    public void carregarBateria(){
        System.out.println(modelo + " está carregando.");
    }
    @Override 
    public void acelerar(){
        System.out.println(modelo + " está acelerando.");
    }
}
