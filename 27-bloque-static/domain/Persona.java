package domain;

class Persona {

  private final int idPersona;
  private static int contadorPersonas;

  // Esto es un bloque de inicializacion estatico
  // Se ejecuta antes del constructor
  static {
    // Este bloque no permite el uso de el operador .this

    System.out.println("Ejecucion bloque Static");
    ++Persona.contadorPersonas;
    // solo se pueden inicializar variables estaticas
    // idPersona = 10;
  }

  // bloque de inicializacion no estatico, se ejecuta antes del constructor de la
  // clase
  // Se ejecutara cada vez que un objecto sea creado. esto es imilar a un constructor, pero no
  {
    System.out.println("Ejecicion de bloque no estatico - contexto dinamico");
    // aqui se pueden inicializar las varialbes no estaticas y tenemos accesso a
    // .this
    this.idPersona = Persona.contadorPersonas++;
  }
  public Persona(){ 
    System.out.println("Ejecucion de el constructor");
   }
  public int getIdPersona() {
    return idPersona;
  }
   
  @Override
  public String toString() {
    return "Persona [idPersona=" + idPersona + "]";
  }

}
