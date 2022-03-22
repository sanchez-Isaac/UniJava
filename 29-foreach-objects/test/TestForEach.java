package test;

//ForEach es un for mejorado
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = { 5, 6, 8, 9 };// esta es una sintaxis resumida para un array

        // ForEach permite recorrer un array de forma simplificada y sin contador y sin
        // index
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        // se debe de especificar el tipo de dato que se guardara en el array
        Persona personas[] = { new Persona("Juan"), new Persona("Karla"), new Persona("Asustin") };
        for (Persona persona : personas) {
            System.out.println("Persona = " + persona);
        }
    }

}
 