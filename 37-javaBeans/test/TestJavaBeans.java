package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();//crear objeto sin pasar argumentos
        //al usar serializable, permite enviar este objecto por internet, del lado del
        //receptor, se usa deserializacion
      
      //Inicializar los valores de la clase, pero formaliza el uso de JavaBeans
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        

        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre:" + persona.getNombre());
        System.out.println("Persona apellido:" + persona.getApellido());
    }
}
