public class Persona { //Esta es el parent class, otras clases heredaran de esta
    protected String nombre;//El uso de Protected permite a las clases que heredan
    protected char genero;//el uso de estas variables, pero no desde fuera de esas clases 
    protected int edad;
    protected String direccion;
    
    //Constructores
    public Persona() {}
    public Persona(String nombre) {this.nombre = nombre;}
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //getters
    public String getNombre()    {return this.nombre;}//no es necesario usar this. en los getters
    public String getDireccion() {return this.direccion;}//pero es una buena practica
    public char getGenero()      {return this.genero;}
    public int getEdad()         {return this.edad;}
    //setters
    public void setEdad(int edad)              {this.edad = edad;}
    public void setNombre(String nombre)       {this.nombre = nombre;}
    public void setGenero(char genero)         {this.genero = genero;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    //toString
    @Override
    public String toString() {
        return "Persona [direccion="   + direccion + 
                           ", edad="   + edad      + 
                           ", genero=" + genero    + 
                           ", nombre=" + nombre    + 
                           "]";
    }

    
}
