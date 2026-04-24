/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;

/**
 *
 * @author melcl
 */
public class Main_Veiculo {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Caminhão VUC", "26KED8T", 3000);
        Veiculo v2 = new Veiculo("audi a6 avant", "584FOE5D", 500);
   
        v1.exibirInfo();
        v2.exibirInfo();
    }

}
