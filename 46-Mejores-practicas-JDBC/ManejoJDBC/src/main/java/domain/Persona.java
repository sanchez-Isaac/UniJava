
package domain;

//Esta clase representara la tabla "Persona" de nuestra base de datos (Esta es una clase de Entidad)
public class Persona {
    //Mapeo de columnas de nuestra base de datos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    
    //Constructores de la clase Entidad
    public Persona() { }
    //Constructor sobre cargado con idPersona
    public Persona(int idPersona) { this.idPersona = idPersona; }
    //Constructor sobre cargado con nombre, apellido, email, telefono
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        //id persona no se requiere por que es auto incrementable, se agrega sola
    }
    //Constructor sobre cargado con idPersona, nombre, apellido, email, telefono
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        //Si se quiere modificar un registro, entonces ID persona si se requiere
    }

    
    //para modifica atributos de manera individual, entonces
    //Se debe tener los Getters y setters
    public int getIdPersona() {return idPersona;}
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getEmail() {return email;}
    public String getTelefono() {return telefono;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setIdPersona(int idPersona) {this.idPersona = idPersona;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setEmail(String email) {this.email = email;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
  //para imprimir el estado del objecto
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
            
    
}
