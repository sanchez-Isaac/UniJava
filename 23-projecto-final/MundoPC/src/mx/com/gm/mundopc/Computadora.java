package mx.com.gm.mundopc;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
private static int contadorComputadoras;
    //Constructors
    private Computadora() { this.idComputadora=++Computadora.contadorComputadoras;}
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
    	this();//llamada el constructor privado local
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;}

        //ToString method
    @Override
    public String toString() {
        return "Computadora [idComputadora=" + idComputadora + ", monitor=" + monitor + ", nombre=" + nombre
                + ", raton=" + raton + ", teclado=" + teclado + "]";
    }

    //Getter
    public int getIdComputadora() {return idComputadora;}   
    public String getNombre() {return nombre;}  
    public Monitor getMonitor() {return monitor;}
    public Teclado getTeclado() {return teclado;}    
    public Raton getRaton() {return raton;}
    //Setter
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setMonitor(Monitor monitor) {this.monitor = monitor;}
    public void setRaton(Raton raton) {this.raton = raton;}
    public void setTeclado(Teclado teclado) {this.teclado = teclado; }

    
}
