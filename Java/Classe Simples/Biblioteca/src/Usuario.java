/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.time.LocalDate;

public class Usuario {
    String nome;
    String tipoUsuario;
    
    Usuario(String nome, String tipoUsuario){
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }
    
    public void calcularPrazoDevolucao(){
        if("Professor".equals(tipoUsuario)){
            LocalDate hoje = LocalDate.now();
            LocalDate daqui30 = hoje.plusDays(30);
            System.out.println("--- Devolução ---");
            System.out.println("Hoje: " +hoje);
            System.out.println("Voce devolvera no dia" + daqui30);
        } else if ("Aluno".equals(tipoUsuario)){
            LocalDate hoje = LocalDate.now();
            LocalDate daqui15 = hoje.plusDays(15);
            System.out.println("--- Devolução ---");
            System.out.println("Hoje: " +hoje);
            System.out.println("Voce devolvera no dia" + daqui15);
        } else if ("Visitante".equals(tipoUsuario)){
            LocalDate hoje = LocalDate.now();
            LocalDate daqui7 = hoje.plusDays(7);
            System.out.println("--- Devolução ---");
            System.out.println("Hoje: " +hoje);
            System.out.println("Voce devolvera no dia" + daqui7);
        } else{
            System.out.println("Insere corretamente!");
        }
    }
}
