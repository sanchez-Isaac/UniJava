package datos;

import java.sql.*;

public class Conexion {
    //Datos unicos de cada base de datos, solo se deben sustituir datos
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    //Conexion con los datos proporcionados / metodo reutilizable
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    //Metodos sobrecargados para recivir diferentes tipos de cierres
    public static void close(ResultSet rs) throws SQLException {rs.close();}
    public static void close(Statement smtm) throws SQLException {smtm.close();}
    public static void close(PreparedStatement smtm) throws SQLException {smtm.close();}
    public static void close(Connection conn) throws SQLException{conn.close();}
}
