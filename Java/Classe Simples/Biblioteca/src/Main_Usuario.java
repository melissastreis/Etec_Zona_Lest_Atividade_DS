/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author melcl
 */
public class Main_Usuario {
    public static void main (String [] args){
        Usuario u1 = new Usuario("Melissa", "Professor");
        Usuario u2 = new Usuario("Sayui", "Aluno");
        Usuario u3 = new Usuario("Ana", "Visitante");
        
        u1.calcularPrazoDevolucao();
        u2.calcularPrazoDevolucao();
        u3.calcularPrazoDevolucao();
    }
}
