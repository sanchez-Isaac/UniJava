
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 =  new Persona(); //every time "new" is found, a new object its created
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        
        System.out.println("persona1 = " + persona1);//this will print the address location of the object1
        System.out.println("persona2 = " + persona2);//this will print the address location of the object2
        //you will need to use toString(), and modify it to make it print the information

        //desplegar info its our toString() method
        persona2.desplegarInformacion();

        //assign values to the object and
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        //call desplegarInfo
        persona2.desplegarInformacion();
    }
}
