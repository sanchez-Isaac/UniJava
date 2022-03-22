class Caja {  //Projecto Caja
  //Calcular el volumen de una caja


    //Crear una clase llamda Caja
    //Caja debe tener 3 atributos del tipo int
    int alto;
    int ancho;
    int profundo;
    int resultado;

    
    Caja(){}
    Caja(int alto,int ancho,int profundo){
      this.alto =alto;
      this.ancho =ancho;
      this.profundo = profundo;
    }
    //un metodo que calcule el volumen de la caja
    //Formaula del volumen vol= ancho x alto x profundo
    public void calcularVolumen(){
     resultado = ancho*alto*profundo;
     System.out.println(resultado);
    }

}


