/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viagem;

/**
 *
 * @author melcl
 */
public class Aviao extends Transporte{
    private double taxaDeAeroporto;

    public Aviao(int capacidade, double precoBase, double taxaDeAeroporto) {
        super(capacidade, precoBase);
        this.taxaDeAeroporto = taxaDeAeroporto;
    }

    @Override
    public double calcularValorPassagem() {
        // Exemplo: preço base + taxa de aeroporto
        return precoBase + taxaDeAeroporto;
    }

    // Getter e Setter
    public double getTaxaDeAeroporto() {
        return taxaDeAeroporto;
    }

    public void setTaxaDeAeroporto(double taxaDeAeroporto) {
        this.taxaDeAeroporto = taxaDeAeroporto;
    }
}
