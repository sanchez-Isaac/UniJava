public class Empleado extends Persona{
   private int idEmpleado; //El uso de Protected permite a las clases que heredan
   private double sueldo; //el uso de estas variables, pero no desde fuera de esas clases 
                         // como ya no se hara herencia de esta clase
                        // para mayor seguridad se usara private
   private static int contadorEmpleado;



   
  
   //para acceder a los constructores de la clase padre, se usa
   //super()
   //para usar el ocnstructor que queremos, se deben de nviar los argumentos
   //necesarios para su uso.
public Empleado(String nombre, double sueldo) {
    super(nombre); //permite llamar al conbstructor de la calse padre
    this.idEmpleado = ++Empleado.contadorEmpleado;//el uso de Empleado. es para 
                                     //referenciar que es una variable estatica
    this.sueldo = sueldo;
}
//getters
   public int getIdEmpleado() {return idEmpleado;}
   public double getSueldo() {return sueldo;}
   //setters
   public void setSueldo(double sueldo) {this.sueldo = sueldo;}
   public void setIdEmpleado(int idEmpleado) {this.idEmpleado = idEmpleado;}


@Override
public String toString() {
    StringBuilder sb = new StringBuilder(); //StringBuilder permite concatenar a un objeto todo
    sb.append("Empleado{idEmpleado=").append(this.idEmpleado);//el string, en lugar de concatenar de forma
    sb.append(", sueldo=").append(sueldo); //normal
    sb.append(", nombre=").append(this.getNombre()); //getNombre es un metodo publico de la clase padre
    sb.append(", persona{").append(super.toString()).append("}"); //llama toString de la clase padre
    sb.append('}');
    return sb.toString();
}
   
   

}
