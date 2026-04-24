/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.musica.model;

/**
 *
 * @author Admin
 */
public class Piano implements Instrumento{
    @Override
    public void tocar(){
        System.out.println("Teclas brancas: Dó, Ré, Mí ..");
        System.out.println("Teclas pretas: bemol ou sustenido");
    }
}
