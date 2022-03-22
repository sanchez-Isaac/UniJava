import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean isVip;
    private static int contadorCliente;

    
    //constructores
    public Cliente(Date fechaRegistro, boolean isVip, String nombre,
     char genero, int edad, String direccion) {
         super(nombre,genero,edad,direccion);//debe de ser lo primero llamado para poder hace uso de los constructores
                 //de la clase padre del programa
                 this.idCliente = ++Cliente.contadorCliente;
                 this.fechaRegistro = fechaRegistro;
                 this.isVip = isVip;
     }

    public int getIdCliente()      {return idCliente;}
    public boolean isVip()         {return isVip;}
    public Date getFechaRegistro() {return fechaRegistro;}

 
    public void setFechaRegistro(Date fechaRegistro) {this.fechaRegistro = fechaRegistro;}
    public void setVip(boolean isVip)                  {this.isVip = isVip;}

    @Override
    public String toString() { // StringBuilder es mejor, pero la flojera gana
        return "Cliente [fechaRegistro=" + fechaRegistro + ", idCliente=" + idCliente + ", isVip=" + isVip + "]";
    }

    

}
