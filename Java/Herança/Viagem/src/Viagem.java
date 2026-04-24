/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viagem;

/**
 *
 * @author melcl
 */
public class Viagem {
    private String destino;
    private Transporte transporte;

    // Construtor
    public Viagem(String destino, Transporte transporte) {
        this.destino = destino;
        this.transporte = transporte;
    }

    public void mostrarDetalhes() {
        System.out.println("Destino: " + destino);
        System.out.println("Capacidade do transporte: " + transporte.getCapacidade());
        System.out.println("Preço da passagem: R$ " + transporte.calcularValorPassagem());
    }

    // Getters e Setters
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
