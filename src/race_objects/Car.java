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
   
    private static final float ADJUST = 2f;
    private static final float FUEL_CONSUME = 15;
    
    private String  model;
    private float   vel_max;
    private Pilot   pilot;
   
    private float dist_at, vel_max_record, vel_at, aux_vel;
    private int fuel_max, fuel_at;
    private int total_time;
    
    private boolean fueling = false;
    private int fuel_time=10;
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
               int fuel,
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
    
    public String GetModel(){
        return this.model;
    }
    
    public Pilot GetPilot(){
        return this.pilot;
    }
    
    public float GetVel(){
        return this.vel_at;
    }
    
    public float GetRecordVel(){
        return this.vel_max_record;
    }
    
    public String GetCarStatus(){
        String time_stamp=total_time+"s";
        if(total_time>60)time_stamp=total_time/60+"m";
        if(total_time>3600)time_stamp=total_time/3600+"h";
        return (time_stamp+" - "+model+" "+vel_at+"km/h "+dist_at+"m ");
    }
    
    public float GetDistAt(){
        return dist_at;
    }
    
    public void Step(){

        if(fuel_at < (fuel_max*5/100) && !fueling){
            fueling = true;
            fuel_time = fuel_max*8/100;
        }
        
        if(!fueling){
            CalcDist();
        }
        else if(fueling && fuel_time > 0){
            fuel_time-=1;
        }
    }
    
    private void CalcDist(){
        aux_vel = vel_at;
        total_time+=1;
        
        float min;
        float max;
        float step_aft;
        float aux_dist=(dist_at==0 ? 1 : dist_at);
        
        do{
                min = 0+(aux_vel/3.6f*25/100); // Minimum value to 25% of ac
                max = aux_vel+(aux_vel/3.6f*50/100); // Maximun value to 50% over ac
                step_aft = (float)Math.sqrt(((Random.FloatRange(min,max) * total_time * total_time * aux_dist))/1/aux_dist);
                if(step_aft >= vel_max/3.6f){
                    min = vel_max-(vel_max*7/100);
                    max = vel_max+(vel_max*3/100);// Bigger chance to decrease when at max
                    step_aft = Random.FloatRange(min,max);
                }
                vel_at = (float)Math.sqrt((aux_vel+ADJUST) * (step_aft));
            }while(vel_at < dist_at/total_time);
        
            if(vel_max_record < vel_at) vel_max_record = vel_at;
            
            dist_at+=vel_at;
            
            if(dist_at%1000==0) fuel_at-=1;
    }
    
    public boolean Finished(int total_size){
        return this.dist_at>=total_size;
    }
}
