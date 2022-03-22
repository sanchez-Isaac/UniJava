package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        
        if( denominador == 0){//reporta la exception en caso de que la division sea entre cero
            throw new OperacionExcepcion("Division entre cero");
        }
        
        return numerador / denominador;
    }
}
