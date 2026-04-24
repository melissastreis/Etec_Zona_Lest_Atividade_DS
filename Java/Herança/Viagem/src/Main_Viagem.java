/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viagem;

/**
 *
 * @author melcl
 */
public class Main_Viagem {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(50, 100.0, 50);
        Aviao aviao = new Aviao(200, 500.0, 150.0);

        Viagem viagem1 = new Viagem("Rio de Janeiro", onibus);
        Viagem viagem2 = new Viagem("São Paulo", aviao);

        viagem1.mostrarDetalhes();
        System.out.println();
        viagem2.mostrarDetalhes();
    }
}
