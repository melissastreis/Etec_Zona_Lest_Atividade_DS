/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author melcl
 */
public class Enfermeira extends Funcionario{
    String coren;
    
    Enfermeira(String nome, String matricula, double salario, String coren){
        super(nome, matricula, salario);
        this.coren = coren;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Informacoes ---");
        System.out.println("Nome: " +nome);
        System.out.println("Maticula: " +matricula);
        System.out.println("Salario: " +salario);
        System.out.println("COREN: " +coren);
    }
}
