package test;

import java.sql.*;


public class TestMySqlJDBC {
    public static void main(String[] args) {
        // al usar el conector de sql de Java
        //Podemos usar el localhost para conectarnos a sql
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        //Esto ya no es muy usado, pero se puede requerir en algunos casos
        try {                                                
           // Class.forName("com.mysql.cj.jdbc.Driver");//en aplicaciones web es muy comun requerir esta linea
           Connection conexion = DriverManager.getConnection(url, "root", "admin");//estos son lo camos de autentificacion
           //objeto de tipo statement que permite ejecutar sentencias en la base de datos
           Statement instruccion = conexion.createStatement();
           
           var sql = "SELECT idpersona, nombre, apellido, email,telefono FROM persona";//instruccion sql
           
           ResultSet resultado = instruccion.executeQuery(sql);//Aqui se ejecuta la instruccion sql
           
           while(resultado.next()){//continuara iterando hasta que ya no haya mas resultados por mostrar de la cosulta
               System.out.print(" ID persona: " + resultado.getInt("idpersona"));
               System.out.print(" Nombre: " + resultado.getString("nombre"));
               System.out.print(" Apellido: " + resultado.getString("apellido"));
               System.out.print(" Email: " + resultado.getString("email"));
               System.out.print(" Telefono: " + resultado.getString("telefono"));
               System.out.println(" ");
           }
           /* } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        */ }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
                                                        
                                                        
                                                        
    } 
}
