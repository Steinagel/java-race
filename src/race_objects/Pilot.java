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
public class Pilot {
    String name;
    float skill, resilience;
    
    public Pilot(String name, 
                 float skill, 
                 float resilience){
        this.name       = name;
        this.skill      = skill;
        this.resilience = resilience;
    }
}
