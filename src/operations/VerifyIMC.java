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
public class VerifyIMC {
    private float massa=0, altura=0;
    
    public void set_values(float _massa, float _altura){
        massa = _massa;
        altura = _altura;
    }
    
    public String calc_status(){
        if(massa==0 || altura==0){
            return "Valores invalidos.";
        }
        else{
            float imc = massa/(altura*altura);
            
            if(imc < 18.5){
                return "Abaixo do peso.";
            }else if(imc < 25.0){
                return "Peso ideal.";
            }else if(imc < 30.0 ){
                return "Sobrepeso.";
            }else if(imc < 35.0){
                return "obesidade Grau I.";
            }else if(imc < 40.0){
                return "Obesidade Grau II.";
            }else{
                return "Obesidade Grau III.";
            }
        }
    }
}
