package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();//variable del tipo interface implementando objetos hija
        //datos.listar(); //imprime mysql
        //imprimir(datos);
        
        datos = new ImplementacionOracle();
        //datos.listar(); //imprime Oracle
        imprimir(datos);
    }
    
    //Metodo generico que recibe una interface como referencia
    //Esto es polymorphism por que puede recibir varias formas
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
