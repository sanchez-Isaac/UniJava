
//Mi clase en Java
public class BrakeCont {

    public static void main(String args[]) {
        
        for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue;//ir a la siguiente iteracion
            }   
            System.out.println("contador = " + contador);
        }
        
//        for( var contador = 0 ; contador < 3 ; contador++ ){
//            if( contador % 2 == 0){
//                System.out.println("contador = " + contador);
//                break;
//            }   
//        }
        
//        var contador = 0;
//        while( contador < 3 ){
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//        var contador = 0;
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        }while( contador < 3);
    }
}
