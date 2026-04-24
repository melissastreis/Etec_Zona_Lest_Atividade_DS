/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.funcionario.test;

import br.edu.etec.funcionario.model.Gerente;
import br.edu.etec.funcionario.model.Vendedor;

public class Teste_Func {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        
        g1.calcularSalario();
        v1.calcularSalario();
    }
}
