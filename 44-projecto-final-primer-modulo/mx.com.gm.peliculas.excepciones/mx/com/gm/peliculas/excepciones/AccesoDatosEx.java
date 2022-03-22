package mx.com.gm.peliculas.excepciones;
//Para que sea una clase de excepciones, recuerda extender de Exceptions
//Expceptions nos obligara a manejar los errores RuntimeExpceptions no nos obliga
//pero para aprender, usar Exception
public class AccesoDatosEx extends Exception{//Esta es la clase padre de las excepciones que hereda de Exception
    //Constructor de la clase padre con Super
    public AccesoDatosEx(String message) {
        super(message);
    }
    
}
