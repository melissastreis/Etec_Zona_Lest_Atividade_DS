/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contato;

/**
 *
 * @author melcl
 */
public class Contato {
    private String nome;
    private String telefone;
    private String email;
    
    Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void exibirInfo(){
        System.out.println("--- Informacoes do Contato ---");
        System.out.println("Nome: " +getNome());
        System.out.println("Telefone: " +getTelefone());
        System.out.println("Email: " +getEmail());
    }
}
