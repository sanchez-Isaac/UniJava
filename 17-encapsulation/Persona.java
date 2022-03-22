public class Persona {
    private String  nombre;
    private double  sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //Getters 
    public String  getNombre()   { return nombre;  }
    public boolean isEliminado() { return eliminado; }
    public double  getSueldo()   { return sueldo; }
    //setters 
    public void setSueldo   (double sueldo)     { this.sueldo = sueldo; }
    public void setNombre   (String nombre)     { this.nombre = nombre; }
    public void setEliminado(boolean eliminado) { this.eliminado = eliminado; }

    @Override
    public String toString() {
        return "Persona [eliminado: " + this.eliminado + ", nombre: " + this.nombre + ", sueldo: " + this.sueldo + "]";
    }
    

}
