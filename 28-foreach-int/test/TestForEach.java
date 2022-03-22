package test;
//ForEach es un for mejorado
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};//esta es una sintaxis resumida para un array

        //ForEach permite recorrer un array de forma simplificada y sin contador y sin index
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
    }
    
}
