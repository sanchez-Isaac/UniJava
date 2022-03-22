package domain;

import java.io.Serializable;

//Para ser rconciderada un JavaBean, necesita implementar Serializable
public class Persona implements Serializable{
    private String nombre; //Para ser rconciderada un JavaBean, todas las variales deben ser
    private String apellido; //privadas/encapsulados
    
    public Persona(){}//Para ser rconciderada un JavaBean, debe tener 1 constructor vacio y publico
    
    public Persona(String nombre, String apellido){//No es obligatorio, pero sirve para inicializar
        this.nombre = nombre;
        this.apellido = apellido;
    }


    //Obligatorio para ser rconciderada un JavaBean, implementar getters y setters
    public String getNombre() { return nombre; }
    public String getApellido() {return apellido;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
