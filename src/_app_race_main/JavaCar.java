/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _app_race_main;
import race_objects.*;
import race_event.*;
/**
 *
 * @author will_
 */
public class JavaCar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING ROAD
        Road road = new Road("Barcelona", 4f, 500, 10, 25, 2);
        //CREATING CAR1
        Pilot HR = new Pilot("Herbert Richard", 10, 5);
        Car FUSION = new Car("Fusion", 206f, 140, HR);
        //CREATING CAR2
        Pilot AH = new Pilot("Alamo Helf", 5, 2);
        Car BUGATI = new Car("Bugati", 420f, 210, AH);
        //CREATING ARRAY OF CARR WITH CAR1 AND CAR2
        Car Car_Array[] = {BUGATI, FUSION};
        
        Start_Race.Run(Car_Array, road);
        
        End_Race.Finish(Car_Array);
        
    }
    
}
