package mx.com.gm.peliculas.negocio;
//Contiene las operaciones necesarias de la aplicacion CatalogoPeliculas
public interface ICatalogoPeliculas {
    
	//el nombre del recurso o archivo, se declarara como constante.
	String NOMBRE_ARCHIVO = "peliculas.txt";

    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarpelicula(String buscar);
    void iniciarCatalogoPeliculas();
    
}
