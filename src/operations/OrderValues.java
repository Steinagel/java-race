/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author stein
 */
public class OrderValues {
    
    private int value1;
    private int value2;
    private int value3;
    
    public void set_values(int v1, int v2, int v3){
        value1 = v1;
        value2 = v2;
        value3 = v3;
    }
    
    public int[] get_sorted(){
        int major = get_bigger(get_bigger(value1, value2), value3);
        int minor = get_minor(get_minor(value1, value2), value3);
        //...
        int half = get_half(value1, value2, value3);
        int[] result = {minor, half, major};
        return result;
    }
    
    public int get_bigger(int c1, int c2){
        if(c1>c2){
            return c1;
        }
        else{
            return c2;
        }
    }
    
    private int get_minor(int c1, int c2){
        if(c1<c2){
            return c1;
        }
        else{
            return c2;
        }
    }
    
    private int get_half(int c1, int c2, int c3){
        if(get_bigger(get_bigger(c1, c2), c3) == c1 && get_minor(get_minor(c1, c2), c3) == c2){
            return c3;
        }
        if(get_bigger(get_bigger(c1, c2), c3) == c2 && get_minor(get_minor(c1, c2), c3) == c3){
            return c1;
        }
        else{
            return c3;
        }
    }
}
