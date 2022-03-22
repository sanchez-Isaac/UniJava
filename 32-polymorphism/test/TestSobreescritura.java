package test;

import domain.*;
//multiples comportaminetos o muchas formas
//visualizable en tiempo de ejecucion 
public class TestSobreescritura {
    public static void main(String[] args) {
        //se define un objecto de la clase padre
       Empleado empleado = new Empleado("Juan", 5000);
       //System.out.println("empleado = " + empleado.obtenerDetalles());
       imprimir(empleado);//envia el objecto creado


       //se define un objecto de la clase hija
       Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
       //System.out.println("gerente = " + gerente.obtenerDetalles());
       imprimir(gerente);//envia el objecto creado
    }
    
    //Esta es la funcion que utiliza el polymorphism
    //este metodo utilizara cualquier objecto de la clase padre u hija y utilizara
   // la funcion de obtenerDetalles

                                     //se usa el objecto mas generico (padre)
    public static void imprimir(Empleado empleado){// el objeto padre se puede comportar como la hija
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
