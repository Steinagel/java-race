/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in_out_put.input;

import race_objects.Car;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author will_
 */
public class Input_Car {
    
    public static Car Options(ArrayList<Car> cars){
        Scanner scan = new Scanner(System.in);
        int size = cars.size();
        int op;
        
        System.out.println("Escolha um Carro: ");

        for(int i=0;i<size;i++){
            System.out.println("\t"+(i+1)+" - "+cars.get(i).GetModel());
        }
        do{
            System.out.print("Opcao: ");
            op = scan.nextInt();
            if(op<1 || op>size) System.out.println("Opcao invalida");
            
        }while(op<1 || op>size);
        
        return cars.get(op-1);
    }
    
    public static int Quantity(){
        Scanner scan = new Scanner(System.in);
        int qtty;
                
        System.out.println("Quantos carros irao correr? (2-100): ");
        do{
            System.out.print("Quantidade: ");
            qtty = scan.nextInt();
            if(qtty<2) System.out.println("No minimo 2 carros devem correr");
            if(qtty>100) System.out.println("No Maximo 100 carros devem correr");
            
        }while(qtty<2 || qtty>100);
        
        return qtty;
    }
}
