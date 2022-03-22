public class Main {
    public static void main(String args[]) {
        var result = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + result);

        var numero = 8;
        result = (numero% 2 == 0)? "numero par" : "numero impar";
        System.out.println("resultado = "+ result);
        
    }
}
