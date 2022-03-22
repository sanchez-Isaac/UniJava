package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

	@Override
	public boolean existe(String nombreArchivo)  {
		File archivo = new File(nombreArchivo);// instanciar archivo file
		return archivo.exists();// verifica si el archivo existe en el sistema

	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
		File archivo = new File(nombreArchivo);// instanciar archivo file
		List<Pelicula> peliculas = new ArrayList<>();// lista de tipo generico que almacenara la lista de peliculas

		// leer cada linea de las peliculas en el archivo
		// Esto estara en un buffered reader envuelto en try catch

		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = null; // Mantiene los datos de la linea del archivo leeido
			linea = entrada.readLine();// lee la linea y la guarda en la variable linea
			// si la linea no es null, entonces revisa cada linea
			while (linea != null) {
				Pelicula pelicula = new Pelicula(linea);
				peliculas.add(pelicula);// con esto se agrega una linea mas de obj pelicula
				linea = entrada.readLine();// volver a leer linea y regresa al loop
			}
			entrada.close();// cerrar flujo
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// Envia nuestra propia excepcion con su mensaje
			throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, e);
			throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());
		}
		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx {
		//inicializamos la variable para el nombre del archivo
		var archivo = new File(nombreArchivo);
		
		//envuelto en un try catch, se declara la impresion del archivo
		try {
			// se indica la variable de archivo y tambien indicamos si se va a anexar informacion o si se va a sobre escribir
			var salida = new PrintWriter(new FileWriter(archivo,anexar));
			salida.println(pelicula.toString());//para que imprima una nueva linea imprimiendo el objecto tipo pelicula
		    salida.close();//se cierra el flujo
		    System.out.println("Se ha escrito informacion el Archivo"+ pelicula);//esto es parte del requerimento del laboratorio
		} catch (IOException e) {
			// se envia el mensaje al usiario en caso de error
			e.printStackTrace();
			throw new EscrituraDatosEx("Excepcion al Escribir peliculas: " + e.getMessage());
		}

	}

	@Override
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
		// se declara el objeto del archivo
		var archivo = new File(nombreArchivo);
		String resultado = null;//aqui se guardara la informacion encontrada
		
		//Se envuelve en un try carch por que mandara una excepcion el buffered reader
		try {
			var entrada = new BufferedReader(new FileReader(archivo));//esta es la lectura del archivo
			String linea = null;//almancenara las lineass que se van a estar leyendo
			linea = entrada.readLine();
			
			int indice = 1; // contadora de lineas para nuestro loop while
			while(linea != null) {
				if(buscar != null && buscar.equalsIgnoreCase(linea)){//si la linea no esta nula y aparte coincide con una linea
					//guardar que el archivo ha sido encontrado
					resultado = "Pelicula " + linea + " Encontrada en el indice " + indice;
					//terminar el loop, porque ya se encontro la pelicula
					break;
				}	
				//si no se encontro la pelicula, entonces
				linea = entrada.readLine();//leer la linea siguiente
				indice++;//incrementar el indice para la siguiente vuelta del loop
			
			}
			entrada.close();//cerrar el flujo
		} catch (FileNotFoundException e) {
			//en caso de error, mandar este mensaje al usuario
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al Buscar peliculas: " + e.getMessage());
		
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al Buscar peliculas: " + e.getMessage());
		}
		
		
		return resultado;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosEx {
		// se crea el nombre de el archivo a abrir
		var archivo = new File(nombreArchivo);
		
		//se envuelve en esta variable de try catch, el archivo a crear
		try {
			//para crear el archivo, se guarda en esta variable
			var salida = new PrintWriter(new FileWriter(archivo));
			salida.close();//se cierra para que se cree el archivo
			System.out.println("Se ha creado el archivo");//enviar mensaje al usuario
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AccesoDatosEx("Excepcion al crear archivo: " + e.getMessage());
		}
				

	}

	@Override
	public void borrar(String nombrearchivo) {
		// declarar archivo de consulta
		var archivo = new File(nombrearchivo);
		if(archivo.exists())//revisar si ya hay un archio existente
			//si hay algo
			archivo.delete();//eliminalo
		System.out.println("Se ha borrado el archivo");//enviar mensaje de que se elimino

	}

}
