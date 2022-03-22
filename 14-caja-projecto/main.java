class Main { // Projecto Caja
  // Calcular el volumen de una caja

  public static void main(String args[]) { 
 //desde main, instanciar un objeto del tipo caja iniciando con los valores
    //ancho = 3
    //alto = 2
    //profundo = 6

    //que imprima los valores en la pantalla
Caja caja1 = new();
caja1.alto = 2;
caja1.ancho = 3;
caja1.profundo = 6;
caja1.calcularVolumen();

    Caja caja2 = new Caja(3,2,6);
    caja2.calcularVolumen();   
  }
}
