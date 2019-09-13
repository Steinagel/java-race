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
public class CalculatorOp {
    public float Calculate(float v1, float v2, int op){
        if(op == 1) return Plus(v1, v2);
        else if(op == 2) return Sub(v1, v2);
        else if(op == 3) return Mult(v1, v2);
        else return Div(v1, v2);
    }
    
    private float Plus(float v1, float v2){
        return v1+v2;
    }
    private float Sub(float v1, float v2){
        return v1-v2;
    }
    private float Mult(float v1, float v2){
        return v1*v2;
    }
    private float Div(float v1, float v2){
        return v1/v2;
    }
}
