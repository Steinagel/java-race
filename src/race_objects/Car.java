/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race_objects;

import java.lang.Math;
import car.utils.Random;
/**
 *
 * @author will_
 */
public class Car {
   
    private static final float CONST = 2f;
    
    private String  model;
    private float   vel_max;
    private Pilot   pilot;
   
    private float dist_at, vel_max_record, vel_at, aux_vel;
    private float fuel_max, fuel_at;
    private int total_time;
    /**
     * This class represents a car object used by a pilot in a road
     * @param model the MODEL of the car
     * @param ac max ACELERATION of car
     * @param vel max VELOCITY of car
     * @param fuel max fuel of car
     * @param road the ROAD the car will run
     * @param pilot the PILOT will drive
     */
    public Car(String model,
               float vel, 
               float fuel,
               Pilot pilot ){
        this.model           =   model;
        this.vel_max         =   vel;
        this.fuel_max        =   fuel;
        this.pilot           =   pilot;
        this.vel_max_record  =   0;
        this.dist_at         =   0;
        this.vel_at          =   1;
        this.total_time      =   0;
        this.fuel_at         =   fuel;
    }
    
    public Car(){
        //DEFAULT
        this.model           =   "Default car";
        this.vel_max         =   190;
        this.fuel_max        =   60;
        this.pilot           =   new Pilot();
        this.vel_max_record  =   0;
        this.dist_at         =   0;
        this.vel_at          =   1;
        this.total_time      =   0;
        this.fuel_at         =   60;
    }
    
    public String Get_Model(){
        return this.model;
    }
    
    public Pilot Get_Pilot(){
        return this.pilot;
    }
    
    public void Step(){
        aux_vel = vel_at;
        total_time+=1;
        
        float min;
        float max;
        float step_aft;
        float aux_dist=dist_at;
        
        do{
            min = 0+(aux_vel*5/100); // Minimum value to 5% of ac
            max = aux_vel+(aux_vel*5/100); // Maximun value to 5% over ac
            // The operation bellow was formulated to disable 0 values to display
            // errors
            step_aft = Random.FloatRange(min,max) * total_time;
            if(step_aft >= vel_max){
                min = vel_max-(vel_max*7/100);
                max = vel_max+(vel_max*3/100);// Bigger chance to decrease when at max
                step_aft = Random.FloatRange(min,max);
            }
            vel_at = (float)Math.sqrt(aux_vel * step_aft);
        }while(vel_at > dist_at/total_time && dist_at != 0);
        
        if(vel_max_record < vel_at) vel_max_record = vel_at;
        dist_at+=vel_at;
        
        System.out.printf("%f - %f\n",dist_at, vel_at);
        
    }
    
    public boolean Finished(int total_size){
        return this.dist_at>=total_size;
    }
}
