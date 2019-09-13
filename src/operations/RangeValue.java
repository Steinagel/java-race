/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author stein
 */
public class RangeValue {
    public void GetStatus(int ini, int end, int k){
        if(k > ini && k < end){
            System.out.println("Valo dentro do intervalo.");
        }else if(k < ini && k > end){
            System.out.println("Valo fora do intervalo.");
        }else{
            System.out.println("Valo na extremidade.");
        }
    }
}
