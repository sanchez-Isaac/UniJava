package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestManejoUsuarios {

    public static void main(String[] args) {
        //Crear un objecto de tipo Conexion
            Connection conexion = null;
        try {
            //Crear un objecto de tipo Conexion
            conexion = Conexion.getConnection();
            //Revisar si autocommit esta activo
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);//Si esta activo, cambiar a falso            
            }
            //Buscaremos hacer el commit nosotros de forma manual
            //Instanciar objecto UsuarioDAO
            UsuarioDAO personajdbc = new UsuarioDAO(conexion);
            
            Usuario cambioPersona = new Usuario();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setEmail("kaivonne@gmail.com");
            cambioPersona.setTelefono("568542359");        
                    
            personajdbc.actualizar(cambioPersona);
            
            Usuario nuevaPersona = new Usuario();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setNombre("Zepeda");
            personajdbc.insertar(nuevaPersona);
            
            
            //hasta este momento se hace el commit de toda la informacion
            conexion.commit();  
            System.out.println("Se ha hecho el commit de la transaccion");
        } catch (SQLException ex) {
                try {
                    ex.printStackTrace(System.out);
                    System.out.println("Entramos al rollback");
                    conexion.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
                }
            
        }
        
        
    }
}
