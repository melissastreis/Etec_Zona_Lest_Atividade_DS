/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viagem;

/**
 *
 * @author melcl
 */
public class Transporte {
    protected int capacidade;
    protected double precoBase;

    // Construtor
    public Transporte(int capacidade, double precoBase) {
        this.capacidade = capacidade;
        this.precoBase = precoBase;
    }

    // Método para calcular valor da passagem
    public double calcularValorPassagem() {
        return precoBase; // Valor base, pode ser sobrescrito pelas subclasses
    }

    // Getters e Setters
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
