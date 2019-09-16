/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _app_race_main;
import race_objects.*;

/**
 *
 * @author will_
 */
public class JavaCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Herbert Richard", 8, 2);
        Road road = new Road("Barcelona", 4f, 150, 3, 25);
        Car car = new Car("Fusion", 206f, 2.1f, 140, road, pilot);
    }
    
}
