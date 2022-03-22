package accesodatos;
//Simula una base de datos
public interface IAccesoDatos {
    int MAX_REGISTRO = 10;//Constante
    
    //Todos los metodos son publicos y abstractos
    void insertar();//Todo lo abstracto no tiene implementacion
    void listar();
    void actualizar();
    void eliminar();
    
}
