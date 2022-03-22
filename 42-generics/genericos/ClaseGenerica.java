package genericos;

//al usar T, el tipo de la clase no se va a saber si no has ta despues, has ta su uso
public class ClaseGenerica<T> {
    //no sabemos de que tipo es
    private T objeto;
    //constructor de la clase generica
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }
    
    //este metodo solo imprime el tipo de elemento en el que se inicializo
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
