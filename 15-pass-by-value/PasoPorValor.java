public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        
        System.out.println("x nuevo valor = " + x);
    }
    /***************************************
     * metodo para demostrar que el passbyvalue
     * No cambia lavariable de donde viene
     * si no que manda una copia y esta se destruye
     * despues de ser usada
     ***************************************/
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        System.out.println("arg1 = " + arg1);

        //para hacer que el valor no se pierda, usar
        //return y cambiar el metodo para que en 
        //lugar de ser void sea un int.
        //en main solo asignar cambioValor(x) a una 
        //nueva variable
    }
}
