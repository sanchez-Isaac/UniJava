import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
   Scanner scanner = new Scanner(System.in);

System.out.println("Proporciona el titulo: ");
var titulo = scanner.nextLine();

System.out.println("Proporciona el autor: ");
var autor = scanner.nextLine();

System.out.println(titulo + " fue escrito por " + autor);

scanner.close(); // always close the scanner
  } 
}


