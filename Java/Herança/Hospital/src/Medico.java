/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author melcl
 */
public class Medico extends Funcionario{
    String crm;
    String especialidade;
    
    public Medico (String nome, String matricula, double salario, String crm, String especialidade){
        super(nome, matricula, salario);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Informacoes ---");
        System.out.println("Nome: " +nome);
        System.out.println("Maticula: " +matricula);
        System.out.println("Salario: " +salario);
        System.out.println("CRM: " +crm);
        System.out.println("Especialidade: " +especialidade);
    }
}
