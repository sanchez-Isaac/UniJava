package test;

import java.util.*;

public class TestColecciones {
//un list es similar a un Array, pero un list puede crecer dinamicamente
    public static void main(String[] args) {
        List miLista = new ArrayList();//Estas listas pueden recibir cualquier tipo de object
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        //iterar una lista con un for each
        for (Object elemento : miLista) {
            System.out.println("elemento = " + elemento);
        }

        //Version en lamnda o funciones flecha
        miLista.forEach(elemento -> { //elemento se convierte en el tipo que es la lista
            System.out.println("elemento = " + elemento);
        });

    }
}
