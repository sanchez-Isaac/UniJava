package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

//las excepciones nos ayudan a que el programa no termine de forma abrupta
//y ayudan a que podemos continuar con la ejecucion del programa
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;

       //Exception nos obliga a usar Try y catch, RuntimeException, no nos obliga pero 
       //igual debe de ser usada, la recomendacion es usar RunetimeException, pues nos
       //ayuda a que el codigo este mas limpio y solo tenemos que seleccionar las exceptiones 
       //que realmente pueden ocurrir
        try{
            resultado = division(10, 0);//envuelve el posible problema y captura el error en catch
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());//accedemos al mensaje de error de manera individual y evitamos toda la pila de informacion
        }catch(Exception e){//Exception e, es la variable que contiene la exception
            System.out.println("Ocurrió un error de tipo Exception: ");//envia a consola este mensaje en caso de que try catch capture el error
            //e.printStackTrace(System.out);//se manda la pila de la excepcion a la consola
            System.out.println(e.getMessage());//accedemos al mensaje de error de manera individual y evitamos toda la pila de informacion6
        }    
        finally{//finally indica que siempre se debe de ejecutar este bloque
            //aqui se pueden cerrar recursos, como conexion a Base de datos
            System.out.println("Se revisó la división entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
