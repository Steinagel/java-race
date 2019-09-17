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
public class Road {
    private String name;
    private float difficulty;
    private int size, laps, max_cars, cars_to_run;
    
    /**
     * This class represents the road of a race
     * @param name the NAME of the road
     * @param difficulty the difficulty of the road,
     *                   it will interfere in the velocity of each car
     * @param size size of the road (km)
     * @param laps how much laps the car will run
     * @param cars max cars supported 
     */
    public Road(String name,
                float difficulty, 
                int size, 
                int laps, 
                int cars,
                int cars_to_run){
        this.name           = name;
        this. difficulty    = difficulty;
        this.size           = size * 1000;
        this.laps           = laps;
        this.max_cars       = cars;
        this.cars_to_run = cars_to_run;
    }
    
    public int GetTotalSize(){
        return size*laps;
    }
    
    public void SetCars(int cars_to_run){
        this.cars_to_run=cars_to_run;
    }
    
    public boolean Finished(int finished_cars){
        return finished_cars==this.cars_to_run;
    }
}
