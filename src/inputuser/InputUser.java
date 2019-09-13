/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputuser;

import java.util.Scanner;
/**
 *
 * @author stein
 */


public class InputUser {
    public int IntInputUser(String msg){
        Scanner s = new Scanner(System.in);
        System.out.print(msg);
        int n = s.nextInt();
        return n;
    }
    public float FloatInputUser(String msg){
        Scanner s = new Scanner(System.in);
        System.out.print(msg);
        float n = s.nextFloat();
        return n;
    }
    public String StrInputUser(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        String n = s.nextLine();
        return n;
    }
}
