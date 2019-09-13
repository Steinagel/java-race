/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import inputuser.InputUser;
import operations.OrderValues;
import operations.CalculatorOp;
/**
 *
 * @author stein
 */
public class Exercicio6 {
    public static void main(String[] args) {
        OrderValues order = new OrderValues();
        InputUser input = new InputUser();
        CalculatorOp calc = new CalculatorOp();
        
        float v1 = input.FloatInputUser("Digite o primeiro valor: ");
        float v2 = input.FloatInputUser("Digite o segundo valor: ");
        int v3 = input.IntInputUser("[1] Adicao\n[2] Subtracao\n[3] Multiplicacao\n[4] Divisao\nOpcao: ");
        
        if(v1<1 || 4>v1) System.out.println("Erro! Opcao invalida.");
        else System.out.printf("O resultado corresponde a: %.2f\n", calc.Calculate(v1, v2, v3));
    }
}
