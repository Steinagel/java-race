/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import inputuser.InputUser;
import operations.VerifyIMC;
/**
 *
 * @author stein
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
        InputUser input = new InputUser();
        
        float massa = input.FloatInputUser("Digite o peso: ");
        float altura = input.FloatInputUser("Digite a altura: ");
        
        VerifyIMC imc = new VerifyIMC();
        
        imc.set_values(massa, altura);
        String result = imc.calc_status();
        
        System.out.println(result);
    }
}
