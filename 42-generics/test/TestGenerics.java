package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {

        //el tipo a usar en la clase generica debe de ser envolvente
        //en este caso Integer, per ose pueden utilizar otras ya que la clase
        //es generica
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        //El uso de string funciona al ser generico
        ClaseGenerica<String> objectoString = new ClaseGenerica("Juan");
        objectoString.obtenerTipo();
    }
}
