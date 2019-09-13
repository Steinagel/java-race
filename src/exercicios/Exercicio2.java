/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import operations.RangeValue;
import inputuser.InputUser;
/**
 *
 * @author stein
 */
public class Exercicio2 {
    public static void main(String[] args) {
        
        InputUser input = new InputUser();
        
        int v1 = input.IntInputUser("Digite o primeiro valor: ");
        int v2 = input.IntInputUser("Digite o segundo valor: ");
        int v3 = input.IntInputUser("Digite o terceiro valor: ");
        
        RangeValue range = new RangeValue();
        
        range.GetStatus(v1, v2, v3);
        
    }
}
