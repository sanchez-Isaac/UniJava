package mx.com.gm.peliculas.datos;

import java.util.ArrayList;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;
import java.util.List;

public interface IAccesoDatos {//las interfaces manejan metodos abstractos, por lo tanto no
	                          //contienen implementacion de lo que hacen
	
	/*********************************************************************
	 * boolean existe();
	 * Existe solo es para saber si existe un archivo
	 * Este metodo puede arojar una excepcion al no encontrar el archivo
	 * ******************************************************************/
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    /*********************************************************************
	 * List<Pelicula>();
	 * Una coleccion de lista, accede al archivo en uso y regresa una lista
	 * de tipo pelicula, arroja excepcion de lecturaDatosEx
	 * ******************************************************************/
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    
    /*********************************************************************
	 * void escribir();
	 * Revisa si los datos se escriben o no
	 * Arroja Excepcion de AccesoDatosEx
	 * ******************************************************************/
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx;
    
    /*********************************************************************
	 * String buscar();
	 * Buscara una pelicula en el archivo
	 * Arroja Excepcion de LecturaDatosEx
	 * ******************************************************************/
    String buscar(String nombreArchivo, String buscar)throws LecturaDatosEx;
    
    /*********************************************************************
	 * void crear();
	 * Para crear un archivo
	 * Arroja Excepcion de AccesoDatos
	 * ******************************************************************/
    void crear(String nombreArchivo)throws AccesoDatosEx;
    
    /*********************************************************************
	 * void borrar();
	 * Para borrar un archivo
	 * Arroja Excepcion de AccesoDatos
	 * ******************************************************************/
    void borrar(String nombrearchivo)throws AccesoDatosEx;
}
