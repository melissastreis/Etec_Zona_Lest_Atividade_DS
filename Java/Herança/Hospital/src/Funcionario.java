/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author melcl
 */
public class Funcionario {
    String nome;
    String matricula;
    double salario;
    
    Funcionario(String nome, String matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public void exibirInfo(){
        System.out.println("--- Informacoes ---");
        System.out.println("Nome: " +nome);
        System.out.println("Maticula: " +matricula);
        System.out.println("Salario: " +salario);
    }
}
