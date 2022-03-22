package mx.com.gm.mundopc;
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada,marca); //super permite el use ode los constructores de la clase padre
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton [contadorRatones=" + contadorRatones + ", idRaton=" + idRaton + super.toString()+"]";
    }

    
}