package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
    	super(tipoEntrada,marca);
    	this.idTeclado= ++Teclado.contadorTeclados;
    	
    }

    @Override
    public String toString() {
        return "Teclado [contadorTeclados=" + contadorTeclados + ", idTeclado=" + idTeclado +super.toString()+ "]";
    }

 
   

    
}
