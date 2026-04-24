/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.StatusPedido.model;

public enum StatusPedido{
    
    NOVO("Pedido criado, aguardando processamento"),
    PROCESSANDO("Pedido em processamento"),
    ENTREGUE("Pedido entregue ao cliente."),
    CANCELADO("Pedido cancelado.");
    
    private final String descricao;
    
    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
