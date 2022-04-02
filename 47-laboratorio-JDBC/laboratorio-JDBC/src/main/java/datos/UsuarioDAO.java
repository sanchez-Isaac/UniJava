package datos;
//DAO - Data Access Object *- clase que ayuda a Selecccionar
//insertar, actualizar o eliminar registros en la base de datos

import static datos.Conexion.close;
import domain.Usuario;
import java.util.*;
import java.sql.*;

;

public class UsuarioDAO {

    //sentencia SQL SELECT
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    //sentencia SQL SELECT
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?,?)";
    //sentencia SQL UPDATE
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    //sentencia SQL DELETE
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    
    
    
    //Metodo que retorna una lista de objectos tipo usuario
    public List<Usuario> seleccionar() {//lista generica de objetos de tipo persona
        Connection conn = null;//
        PreparedStatement stmt = null;//trabaja con queries
        ResultSet rs = null;//
        Usuario usuario = null;//cada renglon seleccionado se convierte en objecto tipo persona

        List<Usuario> usuarios = new ArrayList<>();//aqui se guardaran los resultados del query en forma de objeto

        try {
            //Conectarse a la base de datos
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);//objecto de tipo PreparedStatement con el string Select
            //ejecutar el query
            rs = stmt.executeQuery();
            //Iterar cada registro para crear los objetos de tipo
            //persona por cada registro consultado en la base de datos
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuarioo = rs.getString("usuario");
                String password = rs.getString("password");
                //Aqui para crear el objecto tipo usuario, usaremos el constructor que tiene 
                //todos los atributos de la clase entidad Persona
                usuario = new Usuario(idUsuario, usuarioo, password);// esto hace que se pueda reutilizar la informacion

                usuarios.add(usuario);// se agrega a la lista los resultados del query

            }
        } catch (SQLException ex) {
            //si falla la conexion
            ex.printStackTrace(System.out);

        } finally {
            try {
                //cerrar las conecciones en el orden en que fueron abiertas
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return usuarios;
    }

    public int insertar(Usuario usuario){
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, usuario.getUsuario());//Esto sustituye al parametro 1, "?" de la sentencia INSERT
            stmt.setString(2, usuario.getPassword());//Esto sustituye al parametro 2, "?" de la sentencia INSERT
           
            
            //finalemtne hay que mostrar cuantos registros fueroin afectados
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
        finally{
        try {
            close(stmt);
            close(conn);
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
                }
        return registros;
    }
    
     public int actualizar(Usuario usuario){
     Connection conn = null;
     PreparedStatement stmt = null;
     int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, usuario.getUsuario());//Esto sustituye al parametro 1, "?" de la sentencia UPDATE
            stmt.setString(2, usuario.getPassword());//Esto sustituye al parametro 2, "?" de la sentencia UPDATE
            stmt.setInt(3, usuario.getIdUsuario());//Esto sustituye al parametro 2, "?" de la sentencia UPDATE
            
            //finalemtne hay que mostrar cuantos registros fueroin afectados
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
        finally{
        try {
            close(stmt);
            close(conn);
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
                }
        return registros;
    }
     
          public int eliminar(Usuario usuario){
     Connection conn = null;
     PreparedStatement stmt = null;
     int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1, usuario.getIdUsuario());//Esto sustituye al parametro 5, "?" de la sentencia UPDATE
            registros = stmt.executeUpdate();
            
            //finalemtne hay que mostrar cuantos registros fueroin afectados
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
        finally{
        try {
            close(stmt);
            close(conn);
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
                }
        return registros;
    }
     
}
