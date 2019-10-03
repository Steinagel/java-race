/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race_objects;

import car.utils.Random;
/**
 *
 * @author will_
 */
public class Car {
   
    private static final float ADJUST = 5f;
    
    private String  model;
    private Pilot   pilot;
   
    private float   dist_at, 
                    vel_max_record, 
                    vel_at, 
                    aux_vel,
                    vel_max;
    
    private int     fuel_max, 
                    fuel_at,
                    total_time,
                    place,
                    fuel_time=10;
    
    private boolean fueling = false,
                    finish=false;

    
    public Car(String model,
               float vel, 
               int   fuel,
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
    
    public Car(String model,
               float vel, 
               int   fuel){
        this.model           =   model;
        this.vel_max         =   vel;
        this.fuel_max        =   fuel;
        this.pilot           =   null;
        this.vel_max_record  =   0;
        this.dist_at         =   0;
        this.vel_at          =   1;
        this.total_time      =   0;
        this.fuel_at         =   fuel;
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
    public int GetTotalTime(){
        return this.total_time;
    }
    public boolean GetFinished(){
        return this.finish;
    }
    public void SetFinished(){
        this.finish=true;
    }
    public void SetPlace(int place){
        this.place = place;
    }
    public int GetPlace(){
        return this.place;
    }
    public float GetDistAt(){
        return dist_at;
    }
    
    @Override
    public String toString(){
        if(finish) return(model+" finished! \t");
        if(fueling) return(model+" is fueling! \t");
        String stamp = model+" "+(int)vel_at+"km/h\t";
        return (stamp);
    }
    
    public void Step(){
        if(!finish){
            if(fuel_at < (fuel_max*5/100) && !fueling){
                fueling = true;
                fuel_time = fuel_max*8/100;
            }else if(!fueling){
                CalcDist();
            }else if(fueling && fuel_time > 0){
                fuel_time-=1;
            }else if(fueling && fuel_time <= 0){
                fuel_at=fuel_max;
                fueling = false;
                vel_at=1;
            }
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
            float time2 = total_time*total_time;
            if((total_time/60)%pilot.GetResilience()==0)pilot.DecreaseResilience();
            time2+=pilot.GetSkill()/100;
            float rand_float = Random.FloatRange(min,max);
            float rand_square = ((rand_float * time2 * aux_dist))/1/aux_dist;
            step_aft = (float)Math.sqrt(rand_square);
            if(step_aft >= vel_max/3.6f){
                min = vel_max-(vel_max*7/100);
                max = vel_max+(vel_max*3/100);
                step_aft = Random.FloatRange(min,max);
            }
            vel_at = (float)Math.sqrt((aux_vel+ADJUST) * (step_aft));
        }while(vel_at < dist_at/total_time && (fuel_max-fuel_at)>10);
        
        if(vel_max_record < vel_at) vel_max_record = vel_at;
        dist_at+=vel_at;
        fuel_at-=(vel_at*0.1f)/100;
    }
    
    public boolean Finished(int total_size){
        return this.dist_at>=total_size;
    }
    
    public String FinalResult(){

        String vel =(int)vel_max_record+"km/h\t";
        String stamp = place+" Place: "+pilot.GetName()+" - Time: "+total_time+"s Record: "+vel;
        return (stamp);
    }
        

}
