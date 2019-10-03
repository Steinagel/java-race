/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in_out_put.input;

import race_objects.Road;
import java.util.ArrayList; 
import java.util.Scanner;
/**
 *
 * @author will_
 */
public class Input_Road {
    public static Road Options(ArrayList<Road> roads, int qtty){
        Scanner scan = new Scanner(System.in);
        int size = roads.size();
        int op;
                
        System.out.println("#########################");
        System.out.println("Escolha uma Pista: ");

        for(int i=0;i<size;i++){
            System.out.println("\t"+(i+1)+" - "+roads.get(i).toString());
        }
        do{
            System.out.print("Opcao: ");
            op = scan.nextInt();
            if(op<1 || op>size) System.out.println("Opcao invalida");
            
        }while(op<1 || op>size);
        
        roads.get(op-1).SetCars(qtty);
        return roads.get(op-1);
    }
}
