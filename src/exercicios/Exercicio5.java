/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import operations.OrderValues;
import inputuser.InputUser;
/**
 *
 * @author stein
 */
public class Exercicio5 {
    public static void main(String[] args) {
        OrderValues order = new OrderValues();
        InputUser input = new InputUser();
        
        int v1 = input.IntInputUser("Digite o primeiro valor: ");
        int v2 = input.IntInputUser("Digite o segundo valor: ");
        int v3 = input.IntInputUser("Digite o terceiro valor: ");
        
        int maior = order.get_bigger(order.get_bigger(v1, v2), v3);
        
        System.out.printf("O maior numero corresponde a %d\n", maior);
    }
}
