/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in_out_put.output;

import race_objects.Car;
import race_objects.Pilot;
/**
 *
 * @author will_
 */
public class Output {
    
    Car car[];
    
    public static void PrintCars(Car car[]){
        int i;
        System.out.println("Cars:");
        for(i=0;i<car.length;i++){
            System.out.printf("\tCar %d is a %s and its pilot is %s\n", 
                              (i+1), 
                              car[i].GetModel(), 
                              car[i].GetPilot().Get_Name()
                              );
        }
        System.out.println("Good luck!!");
    }
    
    public static void PrintCarStatus(Car car){
        System.out.println(car.GetCarStatus());
    }
}
