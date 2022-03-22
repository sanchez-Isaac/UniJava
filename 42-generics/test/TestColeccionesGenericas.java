package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();//<String> indica que tipo se utilizara, y el segundo <> se deja asi
        miLista.add("Lunes");                   //hace referencia de que se trabajara con un tipo generico
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);//esto imprime "Lunes"
//        System.out.println("elemento = " + elemento);
        
        //imprimir(miLista);

        Set<String> miSet = new HashSet<>();//<String> nuevamente determina el tipo 
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();//<Sring, String> determina la llave y el valor dentro
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");
        
        String elementoMapa = miMapa.get("valor3");//imprime carlos
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion) {
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

        for(String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }

}
