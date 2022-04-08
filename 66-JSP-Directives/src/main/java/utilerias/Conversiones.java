package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    private static final String FORMATO_FECHA = "dd-MM";
    
    public static String format(Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
    
    public static String format(String fecha){//Esta es una sobrecarga para recibir otro formato que no sea fecha
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}
