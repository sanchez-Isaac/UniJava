package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

//Recuerda que una interface es una coleccion de metodfos abstractod que carecen de 
//una descripcion detallada de que es lo que hacen, cada clase que implemente
//esta interface, tendra que definir que es lo que hace cada metodo abstracto.


public interface PersonaDao {
    //es una lista de tipo Persona DTO
    public List<PersonaDTO> select() throws SQLException;
    //recibe un objeto Persona DTO
    public int insert(PersonaDTO persona) throws SQLException;
    //recibe un objeto Persona DTO
    public int update(PersonaDTO persona) throws SQLException;
    //recibe un objeto Persona DTO
    public int delete(PersonaDTO persona) throws SQLException;
}
