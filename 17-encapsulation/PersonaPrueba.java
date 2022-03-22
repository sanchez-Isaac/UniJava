import Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00, false);
        System.out.println("Persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Juan Carlos Bodoque");

        //System.out.println("Persona1 nombre nuevo: " + persona1.getNombre());
        //System.out.println("Persona1 sueldo: " + persona1.getSueldo());
        //System.out.println("Persona1 eliminado: " + persona1.isEliminado());
        
        //El useo de toString ahorra todo lo anterior 
        System.out.println("Persona1 nombre nuevo: " + persona1.toString());
    }

}
