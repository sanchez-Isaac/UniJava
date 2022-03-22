import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // El usuario proporcionará un valor entre 0 y 10.
        double calif;
        Scanner scanner = new Scanner(System.in);
        String resultado = "Valor desconocido";

        System.out.println("Proporciona un valor entre 0 y 10: ");
        calif= scanner.nextDouble();
        // Si está entre 9 y 10: imprimir una A
        if(calif >= 9 && calif <= 10){System.out.println("A");}
        // Si está entre 8 y menor a 9: imprimir una B
        if(calif >= 8 && calif < 9){System.out.println("B");}
        // Si está entre 7 y menor a 8: imprimir una C
        if(calif >= 7 && calif < 8){System.out.println("C");}
        // Si está entre 6 y menor a 7: imprimir una D
        if(calif >= 6 && calif < 7){System.out.println("D");}
        // Si está entre 0 y menor a 6: imprimir una F
        if(calif >= 0 && calif < 6){System.out.println("F");}
        
        scanner.close(); // always close the scanner
    }
}
