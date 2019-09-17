/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.utils;

/**
 *
 * @author will_
 */
public class Random {
    
    public static int IntRange(int min, int max) {
        if (!(min <= max)) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    
    public static float FloatRange(float min, float max){
        if (!(min <= max)) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        return (float)((Math.random()*((max-min)+1))+min);
    }
}
