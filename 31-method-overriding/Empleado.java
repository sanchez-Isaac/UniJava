package domain;
//method overriding es cuando metodo sobreescribe
// el comportamiento de la clase padre
public class Empleado {  
  
 
  //Protected para que las clases hijas puedan acceder a estos atributos
  //sin getters o setters
  protected String nombre;
  protected double sueldo;

  public Empleado(String nombre, double sueldo){
    this.nombre = nombre;
    this.sueldo = sueldo;
  }

    //Behaviors/Comportamientos
    public String ObtenerDetalles(){
    //este metodo unicamente regresa una cadena
    return "Nombre: " + this.nombre + ", "+ this.sueldo;  
  }

  //Getter
  public String getNombre() {return nombre;}
  public double getSueldo() {return sueldo;}
  //Setter
  public void setNombre(String nombre) {this.nombre = nombre; }
  public void setSueldo(double sueldo) {this.sueldo = sueldo;}
  
  
 




}


