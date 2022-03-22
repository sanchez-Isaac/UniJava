package test;
import domain.Persona;

class Main {  
  public static void main(String args[]) { 

    //al instanciar el objecto, se imprimiran varios strings
    //esto muestra como se cargan las clases en java
    Persona persona1 = new Persona();
    System.out.println("persona1 = " + persona1);

    System.out.println("");//ya no se ejecutara nuevamente el bloque estatico

    Persona persona2 = new Persona();
    System.out.println("persona1 = " + persona2);

  } 
}


