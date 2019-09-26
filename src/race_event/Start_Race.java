/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race_event;

import race_objects.Car;
import race_objects.Road;
import in_out_put.output.Output;
/**
 *
 * @author will_
 */
public class Start_Race {
    
    Car[] array_car;
    
    public static void Run(Car[] array_car, Road road){
        int i, car_cont=0;
        Output.PrintCars(array_car);
        
        while(!road.Finished(car_cont)){
            for(Car car : array_car){
                if(!car.Finished(road.GetTotalSize()))
                    Output.PrintCarStatus(car);
                    car.Step();
                    if(car.Finished(road.GetTotalSize())){
                        car_cont+=1;
                        System.out.println("One finixed");
                    }
            }
        }
        
    }
}
