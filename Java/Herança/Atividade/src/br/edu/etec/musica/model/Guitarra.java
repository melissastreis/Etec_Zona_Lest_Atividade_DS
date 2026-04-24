/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.musica.model;

/**
 *
 * @author Admin
 */
public class Guitarra implements Instrumento {
    @Override
    public void tocar(){
        System.out.println("Nome das cordas");
        System.out.println("Mi, Si, Sol, Ré, Lá, Mi");
    }
}
