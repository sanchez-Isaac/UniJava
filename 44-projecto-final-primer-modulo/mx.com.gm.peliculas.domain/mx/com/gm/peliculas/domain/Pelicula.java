package mx.com.gm.peliculas.domain;    
//Representa los objectos pelicula utilizados en la aplicacion del catalogo
    //de peliculas
public class Pelicula {
	//Esto es practicamente un JavaBean o una clase de Entidad

    //Atrubutos/Variables
    private String nombre;
    
    //Constructor vacio
    public Pelicula() {}
    
    //Constructor inicializando nombre
    public Pelicula(String nombre) {this.nombre = nombre;}
    
    //Getter/Setter
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    //ToString
    @Override
    public String toString() {return this.nombre; }


    

    
}
