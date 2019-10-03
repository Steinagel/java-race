/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _app_race_main;
import race_objects.*;
import race_event.*;
import in_out_put.input.*;
import java.util.ArrayList; 
/**
 *
 * @author will_
 */
public class JavaCar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DEFINE A "WORLD" THAT CONTAINS THE OBJECTS
        ArrayList<Road> RoadList = Global.ArrayListRoads();
        //GETS HOW MANY CARS WILL RUN
        int qtty = Input_Car.Quantity();
        //GET A ROAD BASED ON EXISTING ONES(GLOBAL CLASS)
        Road road = Input_Road.Options(RoadList,qtty);
        //GETS AN ARRAY OF CARS READY TO RUN
        Car[] Car_Array = InputCarByQuantity(qtty);
        //STARTS RUN
        StarEndRace.Run(Car_Array, road);
        //ENDS RUN
    }
    
    private static Car[] InputCarByQuantity(int qtty){
        Car[] cars = new Car[qtty];
        Pilot aux_pilot;
        int i;
        
        for(i=0;i<qtty;i++){
            System.out.println("#########################");
            System.out.println("CARRO "+(i+1)+"/"+qtty);
            aux_pilot = Input_Pilot.Options(Global.ArrayListPilots());
            cars[i] = in_out_put.input.Input_Car.Options(Global.ArrayListCars());
            cars[i].SetPilot(aux_pilot);
        }
        
        return cars;
    }
    
}
