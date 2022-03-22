import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String name;
        int id;
        double precio;
        boolean envioGratuito;
        var scanner = new Scanner(System.in);


        System.out.println("Proporciona el nombre: "); 
        name = scanner.nextLine();
        System.out.println("Proporciona el id: "); 
        id = scanner.nextInt();
        System.out.println("Proporciona el precio: ");
        precio = scanner.nextDouble();
        System.out.println("Proporciona el envio gratuito: ");
        envioGratuito = scanner.nextBoolean();

        System.out.println("<"+name+"> #<"+ id+">");
        System.out.println("Precio: <$"+precio+">");
        System.out.println("Envio Gratuito: <"+envioGratuito+">");
        scanner.close(); // always close the scanner
       

    }

}
