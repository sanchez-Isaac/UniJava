import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    imprimirNumeros(3,4,5);
    imprimirNumeros(1,2 );

    variosParametros("Isaac", 1,2,3,4,5,6,7,8,9);

  } 

//esto demuestra que se pueden usar variables no especificadas y otras en la misma funcion
//la condicion es que debe de ser llamada hasta el final
private static void variosParametros(String nombre, int... numeros){ //funciona como un arreglo/array
  System.out.println("nombre: " + nombre);
  imprimirNumeros(numeros);
}
    

  //init... significa que se enviara un cierto numero de elementos 
  //no especificado, u variables, solo hasta ejecucion, asi que esto se maneja
  //como si fuera un arreglo.
  private static void imprimirNumeros(int... numeros) { //funciona como un arreglo/array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("elemento: "+ numeros[i]);
      
    }


  } 
}


