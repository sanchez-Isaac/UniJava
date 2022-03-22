package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); //No se puede instanciar de clases abstractas
        
        //Permitido por ser hija de la clase abstracta
        FiguraGeometrica figura = new Rectangulo("Rectangulo");//polymorphism
        figura.dibujar();
    }
   
}
