package cpjlaboratoriofinal;
import java.util.Scanner;

import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.negocio.ICatalogoPeliculas;



public class CPJLaboratorioFinal {

    public static void main(String args[]) {

        var opcion = -1;//opcion para inicializar el programa
       
        Scanner scanner = new Scanner(System.in);//variable de escaner para leer el input del usuario
        
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while(opcion !=0) {
        	  System.out.println("Elige opcion: ");
              System.out.println("1.-Iniciar catalogo peliculas");
              System.out.println("2.- Agregar Peliculas");
              System.out.println("3.- Listar Peliculas");
              System.out.println("4.- buscar Peliculas");
              System.out.println("0.- Salir");

              opcion = Integer.parseInt(scanner.nextLine());

              switch (opcion) {
                  case 1:
                	  catalogo.iniciarCatalogoPeliculas();
                      break;
                  case 2:
                	  System.out.println("Introduce el nombre de la pelicula");
                	  var nombrePelicula = scanner.nextLine();                	 
                      catalogo.agregarPelicula(nombrePelicula);
                      break;
                  case 3:
                	  catalogo.listarPeliculas();
                      break;
                  case 4:
                	  System.out.println("Introduce una pelicula a buscar");
                	  var buscar = scanner.nextLine();
                	  catalogo.buscarpelicula(buscar);
                      break;
                  case 0:
                	  System.out.println("Termina el programa");
                	  break;
                  default:
                	  System.out.println("Opcion no reconocida");
                	  break;

              }

        	
        }
        
        String nombreArchivo = "C:\\Users\\isasanchez\\Documents\\Java-Practice\\44-projecto-final-primer-modulo\\peliculas.txt";
       

      
        scanner.close(); // always close the scanner
    }
}
