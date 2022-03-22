import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el numero1: ");
        numero1 = scanner.nextInt();
        System.out.println("Proporciona el numero2: ");
        numero2 = scanner.nextInt();

        System.out.println("El numero mayor es:");
        var result1 = (numero1 > numero2) ? "verdadero" : "falso";
        var result2 = (numero2 > numero1) ? "verdadero" : "falso";
        if (result1 == "verdadero") {
            System.out.println(numero1);
        }
        if (result2 == "verdadero") {
            System.out.println(numero2);
        }
        scanner.close(); // always close the scanner
    }
}
