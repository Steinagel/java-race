/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race_objects;

/**
 *
 * @author will_
 */
public class Car {
    
    private String  model;
    private float   ac_max, vel_max, vel_at;
    private Pilot   pilot;
    private Road    road;
    
    private float dist_at, vel_max_record, fuel_max, fuel_at;
    /**
     * This class represents a car object used by a pilot in a road
     * @param model the MODEL of the car
     * @param ac max ACELERATION of car
     * @param vel max VELOCITY of car
     * @param road the ROAD the car will run
     * @param pilot the PILOT will drive
     */
    public Car(String model,
               float vel, 
               float ac, 
               float fuel,
               Road road,
               Pilot pilot){
        this.model           =   model;
        this.vel_max         =   vel;
        this.ac_max          =   ac;
        this.fuel_max        =   fuel;
        this.road            =   road;
        this.pilot           =   pilot;
        this.vel_max_record  =   0;
        this.dist_at         =   0;
        this.fuel_at         =   fuel;
    }
    
    
}
