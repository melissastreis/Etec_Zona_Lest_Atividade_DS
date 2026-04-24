/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;

/**
 *
 * @author melcl
 */
public class Veiculo {
    String modelo;
    String placa;
    int capacidadeCarga;
    
    Veiculo(String modelo, String placa, int capacidadeCarga){
        this.modelo = modelo;
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirInfo(){
        System.out.println("---- Informações dos Veículos");
        System.out.println("Modelo: " +modelo);
        System.out.println("Placa: " +placa);
        System.out.println("Capacidade de Cargas: " +capacidadeCarga+ " km");
    }
}
