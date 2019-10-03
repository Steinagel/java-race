/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race_event;
import java.util.ArrayList; 
import race_objects.Car;
import race_objects.Road;
import in_out_put.output.Output;
/**
 *
 * @author will_
 */
public class Start_Race {
    
    
    public static void Run(Car[] array_car, Road road){
        ArrayList<Car> array_winner = new ArrayList<Car>();
        
        int i, car_cont=0, time=0;
        Output.PrintCars(array_car);
        
        while(!road.Finished(car_cont)){
            PrintTime(time);
            for(i=0; i< array_car.length; i++){
                Output.PrintCarStatus(array_car[i]);
                array_car[i].Step();
                if(array_car[i].Finished(road.GetTotalSize()) && !array_car[i].GetFinished()){
                    array_winner.add(array_car[i]);
                    car_cont+=1;
                    array_car[i].SetFinished();
                    array_car[i].SetPlace(car_cont);
                }
            }
            System.out.println();
            time++;
        }
        for(Car c:array_winner){
            System.out.print(c.toString());
        }
        
        Output.ShowEnd(array_winner, time);
        
    }
    
    private static void PrintTime(int t){
        String stamp;
        stamp = t+"s ";
        if(t>=60)
            stamp = (int)(t/60)+"m ";
        if(t>=3600)
            stamp = (int)(t/3600)+"h ";

        System.out.print(stamp);
    }
}
