/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.musica.test;

import br.edu.etec.musica.model.Piano;
import br.edu.etec.musica.model.Guitarra;

public class Teste_Musica {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Guitarra g1 = new Guitarra();
        
        p1.tocar();
        g1.tocar();
    }
}
