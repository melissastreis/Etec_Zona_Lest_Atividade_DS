/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.StatusPedido.test;

import br.edu.etec.StatusPedido.model.StatusPedido;
        

public class Main {
    public static void main(String[] args) {
        
        StatusPedido statusAtual = StatusPedido.NOVO;
        
        System.out.println("Status atual: " + statusAtual);
        System.out.println("Descricao: " + statusAtual.getDescricao());
        
        statusAtual = StatusPedido.PROCESSANDO;
        System.out.println("Novo status: " + statusAtual);
        System.out.println("Descricao: " + statusAtual.getDescricao());
        
        if(statusAtual == StatusPedido.PROCESSANDO){
            System.out.println("O pedido esta preparado para entrega");
        }
    }
}
