package test;

import java.util.*;
//La estructura de datos SET, no mantiene el orden en el que fue agregado
public class TestColecciones {

    public static void main(String[] args) {
     
        Set miSet = new HashSet();//no respeta orden
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);
    }
    //polimorphismo - metodo generico
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}
