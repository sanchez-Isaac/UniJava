
package domain;

//Esta clase representara la tabla "Persona" de nuestra base de datos (Esta es una clase de Entidad)
public class Usuario {
    //Mapeo de columnas de nuestra base de datos
    private int idUsuario;
    private String usuario;
    private String password;
    

    
    //Constructores de la clase Entidad
    public Usuario() { }
    //Constructor sobre cargado con idPersona
    public Usuario(int idUsuario) { this.idUsuario = idUsuario; }
    //Constructor sobre cargado con nombre, apellido, email, telefono
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;       
        //id usuario no se requiere por que es auto incrementable, se agrega sola
    }
    //Constructor sobre cargado con idPersona, nombre, apellido, email, telefono
    public Usuario(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;      
        //Si se quiere modificar un registro, entonces ID persona si se requiere
    }

    
    //para modifica atributos de manera individual, entonces
    //Se debe tener los Getters y setters
    public int getIdUsuario() {return idUsuario;}
    public String getUsuario() {return usuario;}
    public String getPassword() {return password;}
   
    
    public void setUsuario(String usuario) {this.usuario = usuario;}
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
    public void setPassword(String password) {this.password = password;}
   
  //para imprimir el estado del objecto
    @Override
    public String toString() {
        return "Persona{" + "idUsuario = " + idUsuario + ", usuario = " + usuario + ", password = " + password+" }";
    }
    
            
    
}
