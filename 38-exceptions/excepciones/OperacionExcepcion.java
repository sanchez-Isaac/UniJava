package excepciones;

public class OperacionExcepcion extends RuntimeException{//No nos obliga a manejar esta exception
    public OperacionExcepcion(String mensaje){//Es para indicar el mensaje de la excepcion
        super(mensaje);//y lo manda a la clase padre, en este caso RuntimeException
    }
}
