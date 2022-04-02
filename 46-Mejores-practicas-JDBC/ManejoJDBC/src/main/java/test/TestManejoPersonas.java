package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();//instanciar el objecto para accecer a las lista de SQL
       
        
        //insertar un nuevo objeto de tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com","55689542");
//        personaDao.insertar(personaNueva);//aqui se envian los datos y se mandan a la base de datos
//        
         //Actualizar un registro
//         Persona personaModificar = new Persona(3,"Miriam", "rezendis", "caesparza@mail.com","5568215689542");
//         personaDao.actualizar(personaModificar);
         
           //Eliminar un registro
           Persona personaEliminar = new Persona(4);
           personaDao.eliminar(personaEliminar);
         
         List<Persona> personas = personaDao.seleccionar();// se recuperan todos los datos de tipo persona
         
         
        //Forma Lambda
        personas.forEach(persona -> {//persona va a lamacenar a todos los resultados que vengan de la lista
            System.out.println("persona : " + persona);//imprime a consola la informacion de los objectos que vienen desde MySQL
        });

        /*//Forma for each
         for(Persona persona: personas){
            System.out.println("persona : " + persona);//imprime a consola la informacion de los objectos que vienen desde MySQL
         }**/
        
    }
}
