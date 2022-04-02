package datos;
//DAO - Data Access Object *- clase que ayuda a Selecccionar
//insertar, actualizar o eliminar registros en la base de datos

import static datos.Conexion.close;
import domain.Persona;
import java.util.*;
import java.sql.*;

;

public class PersonaDAO {

    //sentencia SQL SELECT
    private static final String SQL_SELECT = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
    //sentencia SQL SELECT
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?,?,?,?)";
    //sentencia SQL UPDATE
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idpersona = ?";
    //sentencia SQL DELETE
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";

    
    
    
    //Metodo que retorna una lista de objectos tipo persona
    public List<Persona> seleccionar() {//lista generica de objetos de tipo persona
        Connection conn = null;//
        PreparedStatement stmt = null;//trabaja con queries
        ResultSet rs = null;//
        Persona persona = null;//cada renglon seleccionado se convierte en objecto tipo persona

        List<Persona> personas = new ArrayList<>();//aqui se guardaran los resultados del query en forma de objeto

        try {
            //Conectarse a la base de datos
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);//objecto de tipo PreparedStatement con el string Select
            //ejecutar el query
            rs = stmt.executeQuery();
            //Iterar cada registro para crear los objetos de tipo
            //persona por cada registro consultado en la base de datos
            while (rs.next()) {
                int idPersona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                //Aqui para crear el objecto tipo persona, usaremos el constructor que tiene 
                //todos los atributos de la clase entidad Persona
                persona = new Persona(idPersona, nombre, apellido, email, telefono);// esto hace que se pueda reutilizar la informacion

                personas.add(persona);// se agrega a la lista los resultados del query

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

        return personas;
    }

    public int insertar(Persona persona){
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, persona.getNombre());//Esto sustituye al parametro 1, "?" de la sentencia INSERT
            stmt.setString(2, persona.getApellido());//Esto sustituye al parametro 2, "?" de la sentencia INSERT
            stmt.setString(3, persona.getEmail());//Esto sustituye al parametro 3, "?" de la sentencia INSERT
            stmt.setString(4, persona.getTelefono());//Esto sustituye al parametro 4, "?" de la sentencia INSERT
            
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
    
     public int actualizar(Persona persona){
     Connection conn = null;
     PreparedStatement stmt = null;
     int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, persona.getNombre());//Esto sustituye al parametro 1, "?" de la sentencia UPDATE
            stmt.setString(2, persona.getApellido());//Esto sustituye al parametro 2, "?" de la sentencia UPDATE
            stmt.setString(3, persona.getEmail());//Esto sustituye al parametro 3, "?" de la sentencia UPDATE
            stmt.setString(4, persona.getTelefono());//Esto sustituye al parametro 4, "?" de la sentencia UPDATE
            stmt.setInt(5, persona.getIdPersona());//Esto sustituye al parametro 5, "?" de la sentencia UPDATE
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
     
          public int eliminar(Persona persona){
     Connection conn = null;
     PreparedStatement stmt = null;
     int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1, persona.getIdPersona());//Esto sustituye al parametro 5, "?" de la sentencia UPDATE
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
