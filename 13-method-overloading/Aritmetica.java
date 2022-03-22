package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Constructor 
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
     //Constructor overloading by haveing more than one definition of the constructor
     //Recibes more than one argument at the object definition
    public Aritmetica(int a, int b){ //var is not permitted, needs to be a defined type
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;//El argumento a se asigna al atributo this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
    
}
