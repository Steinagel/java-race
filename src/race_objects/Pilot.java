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
    private String name;
    private float skill, resilience;
    
    public Pilot(String name, 
                 float skill, 
                 float resilience){
        this.name       = name;
        this.skill      = skill;
        this.resilience = resilience;
    }
    
    public Pilot(){
        //DEFAULT 
        this.name       = "Default pilot";
        this.skill      = 5;
        this.resilience = 5;
    }
    
    public String Get_Name(){
        return this.name;
    }
}
