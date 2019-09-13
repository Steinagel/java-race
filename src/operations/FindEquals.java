/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import inputuser.InputUser;
/**
 *
 * @author stein
 * @see using another class to practice
 */
public class FindEquals {
    
    public void InputToVerify(){
        InputUser input = new InputUser();
        
        int n1 = input.IntInputUser("Digite o primeiro numero inteiro: ");
        int n2 = input.IntInputUser("Digite o segundo numero inteiro: ");
        int n3 = input.IntInputUser("Digite o terceiro numero inteiro: ");
        
        if(VerifyEqual(n1, n2, n3)) System.out.println("Existem numeros iguais.");
        else System.out.println("Nao existem numeros iguais.");
    }
    
    private boolean VerifyEqual(int n1, int n2, int n3){
        if(n1==n2 || n1 == n3 || n2 == n3) return true;
        else return false;
    }
}
