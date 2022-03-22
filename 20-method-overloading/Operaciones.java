
//sobrecarga de metodos
//ocurrecuando hay mas de un metodo con el mismo nombre con argumentos diferentes

//en este caso, Operaciones recibe numeros enteros
public class Operaciones {
  public static int sumar(int a, int b) {
    System.out.println("int sumar(int a, int b)");
    return a + b;

  }
// en este se reciben numeros dobles/flotantes de punto decimal
  public static double sumar(double a, double b) {
System.out.println("double sumar(double a, double b)");
    return a + b;
  }
}
