package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();//instanciar el objecto para accecer a las lista de SQL
       
        
        //INSERT un nuevo objeto de tipo usuario
//        Usuario usuarioNuevo = new Usuario("carlos Vela", "123456Malacontraseña");
//        usuarioDao.insertar(usuarioNuevo);//aqui se envian los datos y se mandan a la base de datos
       
         //UPDATE un registro
//         Usuario UsuarioModificar = new Usuario(3,"carlos Vela", "DigamosQueEsMejorContraseña");
//         usuarioDao.actualizar(UsuarioModificar);
         
         //DELETE un registro
         Usuario usuarioEliminar = new Usuario(2);// el parametro es el id a eliminar
         usuarioDao.eliminar(usuarioEliminar);
     
           
           
          //Mostrar datos SELECT 
         List<Usuario> usuarios = usuarioDao.seleccionar();// se recuperan todos los datos de tipo persona
         //Forma Lambda
        usuarios.forEach(usuario -> {//persona va a lamacenar a todos los resultados que vengan de la lista
            System.out.println("usuario : " + usuario);//imprime a consola la informacion de los objectos que vienen desde MySQL
        });

        /*//Forma for each
         for(Persona persona: personas){
            System.out.println("persona : " + persona);//imprime a consola la informacion de los objectos que vienen desde MySQL
         }**/
        
    }
}
