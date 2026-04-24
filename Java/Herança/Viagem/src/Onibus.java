/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viagem;

/**
 *
 * @author melcl
 */
public class Onibus extends Transporte{
    private int numeroAssentos;

    public Onibus(int capacidade, double precoBase, int numeroAssentos) {
        super(capacidade, precoBase); // chama o construtor da classe pai
        this.numeroAssentos = numeroAssentos;
    }

    @Override
    public double calcularValorPassagem() {
        // Exemplo: preço base + taxa por assento
        return precoBase + (numeroAssentos * 0.5);
    }

    // Getter e Setter
    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }
}
