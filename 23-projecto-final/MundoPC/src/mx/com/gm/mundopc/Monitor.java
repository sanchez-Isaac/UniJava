package mx.com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int ContadorMonitor;

    //Constructors
    private  Monitor() {this.idMonitor = ++Monitor.ContadorMonitor;}
    
    public Monitor(String marca, double tamano) {
    	this();// llama al contructor local privado
        this.marca = marca;
        this.tamano = tamano;
    }
    
    //getter
    public String getMarca() {return marca;}
    public double getTamano() {return tamano;}
    public int getIdMonitor() { return this.idMonitor;}
    //Setter
   
    public void setMarca(String marca) {this.marca = marca;}
    public void setTamano(double tamano) {this.tamano = tamano;}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
  

}
