/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import inputuser.InputUser;
import operations.OrderValues;
/**
 *
 * @author stein
 * @see operations could be only one file, just practicing
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        OrderValues order = new OrderValues();
        
        InputUser input = new InputUser();
        
        int v1 = input.IntInputUser("Digite o valor inicial do intervalo: ");
        int v2 = input.IntInputUser("Digite o valor final do intervalo: ");
        int v3 = input.IntInputUser("Digite o valor a ser analisado: ");
        
        order.set_values(v1, v2, v3);
        
        int result[] = new int[3];
        
        result = order.get_sorted();
        
        System.out.printf("Os valores ordenados correspondem a: %d %d %d\n" ,result[0], result[1], result[2]);
    }
    
}
