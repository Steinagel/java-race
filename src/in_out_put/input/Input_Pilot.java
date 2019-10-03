/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in_out_put.input;

import race_objects.Pilot;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author will_
 */
public class Input_Pilot {
    public static Pilot Options(ArrayList<Pilot> pilots){
        Scanner scan = new Scanner(System.in);
        int size = pilots.size();
        int op;
                
        System.out.println("Escolha um Piloto: ");

        for(int i=0;i<size;i++){
            System.out.println("\t"+(i+1)+" - "+pilots.get(i).toString());
        }
        do{
            System.out.print("Opcao: ");
            op = scan.nextInt();
            if(op<1 || op>size) System.out.println("Opcao invalida");
            
        }while(op<1 || op>size);
        
        return pilots.get(op-1);
    }
}
