package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

//Contiene la implementacion de las operaciones necesarias de la 
//aplicacion CatalogoPeliculas
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
    //atributos
  private final  IAccesoDatos datos;
  
  

	public CatalogoPeliculasImpl() {
		this.datos = new AccesoDatosImpl();
	}

	@Override
	public void agregarPelicula(String nombrePelicula) {
		Pelicula pelicula = new Pelicula(nombrePelicula);
		boolean anexar = false;
		try {
			anexar = datos.existe(NOMBRE_ARCHIVO);
			datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
		} catch (AccesoDatosEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
			System.out.println("Error de acceso a datos");
		}
	}

	@Override
	public void listarPeliculas( ) {
		try {
			var peliculas  = this.datos.listar(NOMBRE_ARCHIVO);
			for(var pelicula : peliculas) {
				System.out.println("pelicula = " + pelicula);
			}
		} catch (LecturaDatosEx e) {
			System.out.println("Error de acceso datos");
			e.printStackTrace(System.out);
		}
		
	}

	@Override
	public void buscarpelicula(String buscar) {
		String resultado = null;
		try {
			resultado = this.datos.buscar(NOMBRE_ARCHIVO, buscar);
		} catch (AccesoDatosEx e) {
			// TODO Auto-generated catch block
			System.out.println("Error de acceso datos");
			e.printStackTrace(System.out);
		}
		System.out.println("resultado = " + resultado);
		
		
	}

	@Override
	public void iniciarCatalogoPeliculas() {
		try {
			if(this.datos.existe(NOMBRE_ARCHIVO)) {
				datos.borrar(NOMBRE_ARCHIVO);
				datos.crear(NOMBRE_ARCHIVO);
			}
			else {
				datos.crear(NOMBRE_ARCHIVO);
			}
		} catch (AccesoDatosEx e) {
			// TODO Auto-generated catch block
			System.out.println("Error al iniciar catalogo de peliculas");
			e.printStackTrace();
		}
		
	}

  



}
