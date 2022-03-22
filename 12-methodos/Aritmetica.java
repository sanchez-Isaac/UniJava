package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
public int sumarConArgumentos(int a, int b){// method with passed arguments
    this.a = a;
    this.b = b;

    //return a + b;
    //or you can use the local method
    return sumarConRetorno();// because you already modified a and b
}


}
