/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {
        
        Veiculoum C1 = new Veiculoum("Ford", 1965, "Mustang");
        Carro C2 = new Carro("Chevrolet", 1969, "Camaro", "Gasolina");
        CarroEletrico C3 = new CarroEletrico("Tesla", 2021, "Model S", "Energia", 100);
    }
}
