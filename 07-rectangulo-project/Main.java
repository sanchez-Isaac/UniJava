import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int alto;
        int ancho;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el alto: ");
        alto = scanner.nextInt();
        System.out.println("Proporciona el ancho: ");
        ancho = scanner.nextInt();
        ///////////////////////////
        System.out.println("Perimetro: " + alto*alto);
        System.out.println("Area: " + (alto+ancho) *2);
        scanner.close(); // always close the scanner

    }
}
