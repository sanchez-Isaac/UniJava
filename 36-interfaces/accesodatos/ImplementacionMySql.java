package accesodatos;
//Simulacion de una base de datos de mySql
public class ImplementacionMySql implements IAccesoDatos {
//Al usar implements en una interface abstracta, estamos aobligados 
//a implementar sus metodos abhstractos y definir su comportamiento
    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");

    }

}
