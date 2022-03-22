import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
       
        var age = Integer.parseInt("20");
        var age2 = "20";

        System.out.println("age = " + (age + 1)); //21
        System.out.println("age = " + (age2 + 1)); //201
        //////////////////
        var valPI = Double.parseDouble("3.1416");//from string to int
        System.out.println("ValPI = " + valPI);
        /////////////////
        System.out.println("Proporciona una edad: ");
        var scanner = new Scanner(System.in);
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("age = " + scanner);
        ////////////////

        var textAge = String.valueOf(age); //uses last age var to change it into a string
        System.out.println("age = " + textAge);

        ///////////////
        var character = "hola".charAt(1); // this returns a char at "x" position of the string
        System.out.println("character = " + character);


        System.out.println("Proporciona una letra: ");
        character = scanner.nextLine().charAt(0);
        System.out.println("character = " + character);

        scanner.close(); // always close the scanner
    }

}
