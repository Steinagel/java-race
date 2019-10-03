/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in_out_put.output;
import java.util.ArrayList; 
import race_objects.*;
/**
 *
 * @author will_
 */
public class Output {
    
    Car car[];
    
    public static void PrintCars(Car car[], Road road){
        int i;
        
        System.out.println("Pista: "+road.toString());
        System.out.println("Cars:");
        for(i=0;i<car.length;i++)
            System.out.printf("\tCar %d is a %s and its pilot is %s\n", 
                              (i+1), 
                              car[i].GetModel(), 
                              car[i].GetPilot().GetName());
        
        System.out.println("Good luck!!");
    }
    
    public static void PrintCarStatus(Car car){
        System.out.print(car.toString());
    }
    
    public static void ShowEnd(ArrayList<Car> cars, int time){
        System.out.println("\n\nTotal time: "+time+"s"+"/"+(int)(time/60)+"m");
        cars.forEach((car) ->{
            System.out.println(car.FinalResult());
        });
    }
}
