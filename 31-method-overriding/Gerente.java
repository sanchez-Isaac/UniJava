package domain;
//method overriding es cuando metodo sobreescribe
// el comportamiento de la clase padre
public class Gerente extends Empleado {  
  
 private String departamento;

public Gerente(String nombre, double sueldo, String departamento) {
  super(nombre, sueldo);//debe de ser llamado en la primera linea para
                       //usar el constructor de la clase padre
  this.departamento = departamento;
}

@Override //anotacion indicando que estamos 
         //sobreescribiendo el metodo de la clase padre
 public String obtenerDetalles(){
   //esto ejecuta el metodo en la clase padre
   return super.obtenerDetalles() + ", departamento: " + departamento;
  }
}


