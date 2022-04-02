package datos;
//DAO - Data Access Object *- clase que ayuda a Selecccionar
//insertar, actualizar o eliminar registros en la base de datos

import static datos.Conexion.close;

import domain.Usuario;
import java.util.*;
import java.sql.*;

public class UsuarioDAO {
    // es una conexion fuera de la clase

    private Connection conexionTransaccional;// para manejar la transaccion de informacion
    //sentencia SQL SELECT
    private static final String SQL_SELECT = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
    //sentencia SQL SELECT
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?,?,?,?)";
    //sentencia SQL UPDATE
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idpersona = ?";
    //sentencia SQL DELETE
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";

    //Constructor vacio
    public UsuarioDAO() {

    }

    //Constructor recibiendo conexionTransaccional para manejar la conexion y mantenerla abierta
    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;

    }

    //Metodo que retorna una lista de objectos tipo usuario
    public List<Usuario> seleccionar() throws SQLException {//lista generica de objetos de tipo persona
        Connection conn = null;//
        PreparedStatement stmt = null;//trabaja con queries
        ResultSet rs = null;//
        Usuario usuario = null;//cada renglon seleccionado se convierte en objecto tipo persona

        List<Usuario> usuarios = new ArrayList<>();//aqui se guardaran los resultados del query en forma de objeto

        try {
            //Conectarse a la base de datos, si ya existe conexionTransaccional, entonces no usar Conexion.getConnection()
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
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
               usuario = new Usuario(idPersona, nombre, apellido, email, telefono);// esto hace que se pueda reutilizar la informacion

                usuarios.add(usuario);// se agrega a la lista los resultados del query

            }
        } finally {
            //cerrar las conecciones en el orden en que fueron abiertas
            Conexion.close(rs);
            Conexion.close(stmt);
            //Con esto se indica que no se debe de cerrar  si es diferente de null
            if (this.conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }

        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

             stmt.setString(1, usuario.getNombre());//Esto sustituye al parametro 1, "?" de la sentencia INSERT
            stmt.setString(2, usuario.getApellido());//Esto sustituye al parametro 2, "?" de la sentencia INSERT
            stmt.setString(3, usuario.getEmail());//Esto sustituye al parametro 3, "?" de la sentencia INSERT
            stmt.setString(4, usuario.getTelefono());//Esto sustituye al parametro 4, "?" de la sentencia INSERT
            
            //finalemtne hay que mostrar cuantos registros fueroin afectados
            registros = stmt.executeUpdate();
        }  finally {
            //cerrar las conecciones en el orden en que fueron abiertas

            Conexion.close(stmt);
            //Con esto se indica que no se debe de cerrar  si es diferente de null
            if (this.conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getNombre());//Esto sustituye al parametro 1, "?" de la sentencia UPDATE
            stmt.setString(2, usuario.getApellido());//Esto sustituye al parametro 2, "?" de la sentencia UPDATE
            stmt.setString(3, usuario.getEmail());//Esto sustituye al parametro 3, "?" de la sentencia UPDATE
            stmt.setString(4, usuario.getTelefono());//Esto sustituye al parametro 4, "?" de la sentencia UPDATE
            stmt.setInt(5, usuario.getIdPersona());//Esto sustituye al parametro 5, "?" de la sentencia UPDATE
            registros = stmt.executeUpdate();
            
            //finalemtne hay que mostrar cuantos registros fueroin afectados
            registros = stmt.executeUpdate();
        }  finally {
            //cerrar las conecciones en el orden en que fueron abiertas

            Conexion.close(stmt);
            //Con esto se indica que no se debe de cerrar  si es diferente de null
            if (this.conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }
        return registros;
    }

    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

               stmt.setInt(1, usuario.getIdPersona());//Esto sustituye al parametro 5, "?" de la sentencia UPDATE
            registros = stmt.executeUpdate();
            
            //finalemtne hay que mostrar cuantos registros fueroin afectados
            registros = stmt.executeUpdate();
        } finally {
            //cerrar las conecciones en el orden en que fueron abiertas

            Conexion.close(stmt);
            //Con esto se indica que no se debe de cerrar  si es diferente de null
            if (this.conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }
        return registros;
    }

}
