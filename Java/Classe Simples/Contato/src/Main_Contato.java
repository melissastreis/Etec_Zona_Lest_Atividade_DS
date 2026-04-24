/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contato;

/**
 *
 * @author melcl
 */
public class Main_Contato {
    public static void main (String [] args){
        Contato pessoa1 = new Contato("Melissa", "11968325585", "mel@gmail.com");
        Contato pessoa2 = new Contato("Sayuri", "11968951285", "yuri@gmail.com");
        
        pessoa1.exibirInfo();
        pessoa2.exibirInfo();
    }
}
